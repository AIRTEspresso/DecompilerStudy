# Further Analyses of Bugs in Decompilation Failures

The following table lists the bugs we summarised from the three kinds of failures, including their failure periods (*Failure Period*), the number of tests presenting the same error symptoms (*#*), brief descriptions or the error logs of the failures (*Description(Error Logs)*), the bug issues we created for this bug (*Reported Issues*) and the states of these issues (*State*). In addition,  the first letter of *ID* indicates which project the bug belongs to:   "C" for *CFR*, "F" for *FernFlower* and "J" for *Jadx*.

We recognized bug *J-10* from the "cast missing" error repeated in 149 tests in testing *Jadx*. To explain *J-10*, let's suppose an assignment ``x += y;`` where ``x`` is a long variable and ``y`` is a float constant like ``0.275f``. *Jadx* inlined constant ``y`` and simplified the assignment into ``x += 0.275f;``. This simplification introduced a syntactic error in the decompiled code because float constant can not be directly added to a long variable. Eventually, JD-Tester found the recompilation failure according to the error log "incompatible types: possible lossy conversion from float to long" reported by Java compilers. Similar code patterns existed in 149 tests and JD-Tester failed to recompile all the 149 tests with the same kind of error logs. Besides *J-10*, we found another nine type inference bugs presenting as "cast missing" errors, namely *C-3, C-6, J-7, F-1, F-2, J-8, J-9, J-11, J-13* and *J-15*.

Among all the 37 bugs, we also found at least 11 bugs, namely *C-1, C-2, C-4, C-5, C-10, J-6, J-4, J-5, J-6, J-19* and *J-20* that were highly relevant to region restoration of "GOTO" structures. In addition, in the 11 bugs we found 6 (*C-1, C-2, C-5, J-4, J-5 and J-6*) related to ``switches``, and 4 (*C-4, C-10, J-19, J-20*) were related to``loops``, and another 4 (*C-5, J-4, J-5, J-6*) were related to the combinations of ``switches`` and ``loops``.  Our confidence comes from that we can always find code patterns with similar "GOTO" structures in the tests with similar failures. In addition, we found there were two bugs (*J-1, J-2*) related to the multi-entry loop pattern matching of *Jadx* according to the error logs.

Another interesting finding is that two bugs (*C-8, F-4*), though not many, were due to over-optimization. Take bug *F-4* as an example, for composite expression ``{(-(i1 - s)+(103.596F + iMeth()))- 43490}`` in the source code, *FernFlower* simplified it into ``(-(i1 - s)) + 103.596F + (float)iMeth() - 43490`` by removing the brackets out of ``(103.596F + iMeth())``. Though it seemed harmless, this optimization changed the execution order of this expression and led to a floating point error. 

The bug table is as follows:

|ID|Failure Period|#|Description (Error Logs)|Reported Issue|State|
|---|---|--|----|---|---|
|  C-1  | Decompilation | 47 | CFR Error: Unable to fully structure code(**case) | https://GitHub.com/leibnitz27/cfr/issues/311 | Reported|
|  C-2  | Recompilation | 3   | Compilation Error: undefined label | https://GitHub.com/leibnitz27/cfr/issues/312 | Reported|
|  C-3  | Recompilation | 87 | Compilation Error: illegal parenthesized expression | https://GitHub.com/leibnitz27/cfr/issues/313 | Reported|
|  C-4  | Recompilation | 45 | Compilation Error: variable might not have been initialized | https://GitHub.com/leibnitz27/cfr/issues/314 | Reported|
|  C-5  | Recompilation | 15 | Compilation Error: unreachable statement | https://GitHub.com/leibnitz27/cfr/issues/315 | Reported|
|  C-6  | Recompilation | 4 | Compilation Error: incompatible types: int cannot be converted to boolean |  https://GitHub.com/leibnitz27/cfr/issues/330 | Reported|
|     C-7  | Comparison | 3 | Generate i-- for --i when refactoring while(true)-break loops from for-loops | https://GitHub.com/leibnitz27/cfr/issues/305 | Reported|
|     C-8  | Comparison | 9 | Inline statements in loops in reversed orders | https://GitHub.com/leibnitz27/cfr/issues/304 | Reported|
|     C-9  | Comparison | 3 | Split composite expressions used as parameters in invocations in revered execution order | https://GitHub.com/leibnitz27/cfr/issues/306 | Reported|
|     C-10  | Comparison | 4 | Generate while(++i<7){...;continue;} for do{...}while(++i<7)}, which leads to hangs | https://GitHub.com/leibnitz27/cfr/issues/309 | Reported|
|     C-11  | Comparison | 1 | Incorrectly place the index increment statement of the outer loop in the nested loop | https://GitHub.com/leibnitz27/cfr/issues/310 | Reported|
|     F-1  | Recompilation | 5 | Compilation error: incompatible types: possible lossy conversion from long to int | https://youtrack.jetbrains.com/issue/IDEA-291579 | Confirmed|
|     F-2  | Comparison | 27 | Incorrectly assign type byte to integer variables, which leads to different values printed | https://youtrack.jetbrains.com/issue/IDEA-299847 | Confirmed|
|     F-3  | Comparison | 2 | Generate var1\|=var2 for var1+=var2\|var1 only in nested loops | https://youtrack.jetbrains.com/issue/IDEA-291729 | Confirmed |
|     F-4  | Comparison | 1 | Incorrectly generate composite expressions containing parentheses, in reversed execution orders of their sub expressions| https://youtrack.jetbrains.com/issue/IDEA-291735 | Confirmed |
|     F-5  | Comparison | 1 | Different variables in the source code point to the same one in the generated code | https://youtrack.jetbrains.com/issue/IDEA-291807 | Confirmed |
|     F-6  | Comparison | 2 | Generate incorrect code for meaningless assignments (though meaningful when an exception is thrown) in try-catch blocks  | https://youtrack.jetbrains.com/issue/IDEA-291806 | Confirmed |
|     J-1  | Decompilation | 2 | JADX Error: Failed to detect multi-entry loops with NullPointerException |https://GitHub.com/skylot/jadx/issues/1611 | Fixed |
|     J-2  | Decompilation | 1 | JADX Error: Failed to detect multi-entry loops with ArrayIndexOutOfBoundsException | https://GitHub.com/skylot/jadx/issues/1615 | Reported |
|     J-3  | Decompilation | 1 | JADX Error: Failed compute block dominance frontier with IndexOutOfBoundsException | https://GitHub.com/skylot/jadx/issues/1612 | Reported |
|     J-4  | Decompilation | 26 | JADX Error: Can't fix incorrect switch cases order, some code will duplicate | https://GitHub.com/skylot/jadx/issues/1613 | Reported |
|     J-5  | Decompilation | 24 | JADX Error: Code restructure failed: missing block | https://GitHub.com/skylot/jadx/issues/1614 | Reported |
|     J-6  | Decompilation | 35 | JADX Error: Removed duplicated region for block | https://GitHub.com/skylot/jadx/issues/1617 | Reported |
|     J-7  | Decompilation | 11 | JADX Error: Multi-variable type inference failed | https://GitHub.com/skylot/jadx/issues/1618 | Reported |
|     J-8  | Recompilation | 1 | Compilation Error: integer number too large| https://GitHub.com/skylot/jadx/issues/1619 | Reported |
|     J-9  | Recompilation | 46 | Compilation Error: bad operand types for binary operator "&", "\|"  | https://GitHub.com/skylot/jadx/issues/1620 | Reported |
|     J-10  | Recompilation | 159 | Compilation Error: incompatible types: possible lossy conversion from float to long | https://GitHub.com/skylot/jadx/issues/1621 | Reported |
|     J-11  | Recompilation | 11 | Compilation Error: incompatible types: possible lossy conversion from int to byte | https://GitHub.com/skylot/jadx/issues/1622 | Reported |
|     J-12  | Recompilation | 144 | Compilation Error: variable might not have been initialized | https://GitHub.com/skylot/jadx/issues/1623 | Reported |
|     J-13  | Recompilation | 15 | Compilation Error: incompatible types: possible lossy conversion from int to short | https://GitHub.com/skylot/jadx/issues/1624 | Reported |
|     J-14  | Recompilation | 85 | Compilation Error: unreachable statement | https://GitHub.com/skylot/jadx/issues/1625 | Reported |
|     J-15  | Recompilation | 3 | Compilation Error: bad operand types for binary operator "<<", "<<<" | https://GitHub.com/skylot/jadx/issues/1626 | Reported |
|     J-16  | Comparison | 3 | Generate incorrect guard conditions for loops like while(++i< XX){...}} | https://GitHub.com/skylot/jadx/issues/1634 | Reported|
|     J-17  | Comparison | 1 | Generate incorrect case blocks for switches containing breaks | https://GitHub.com/skylot/jadx/issues/1635 | Reported|
|     J-18  | Comparison | 2 | Incorrect place the index increment statement in the middle the loops when decompiling for-loops | https://GitHub.com/skylot/jadx/issues/1636 | Reported|
|     J-19  | Comparison | 2 | Decompile two directly close loops into the two branches of a if statement inside a while(true) loop | https://GitHub.com/skylot/jadx/issues/1637 | Reported|
|     J-20  | Comparison | 5 | Index of a for-loop sometimes is increased twice when the loop contains complex switches | https://GitHub.com/skylot/jadx/issues/1638 | Reported|