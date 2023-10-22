# Further Analyses of Bugs in Decompilation Failures

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
| C-12 |  Recompilation | 297 | Lose generic types for generic class declarations with multiple type arguments | https://GitHub.com/leibnitz27/cfr/issues/337 | Reported|
| C-13 |  Recompilation | 32 | Generate concrete types from generic types of cast expressions in generic class declarations | https://GitHub.com/leibnitz27/cfr/issues/338 | Reported|
| C-14 |  Recompilation | 101 | Generate duplicate variable names inside and outside lambda expressions | https://GitHub.com/leibnitz27/cfr/issues/339 | Reported|
| C-15 |  Recompilation | 73 | Lose type arguments for assignments to null reference | https://GitHub.com/leibnitz27/cfr/issues/340 | Reported|
| C-16 |  Recompilation | 41 | Generate wrapper types from primitive types of cast expressions in generic class declarations | https://GitHub.com/leibnitz27/cfr/issues/341 | Reported|
| C-17 |  Recompilation | 42 | Lose cast expressions of arguments in instantiation  | https://GitHub.com/leibnitz27/cfr/issues/342 | Reported|
| C-18 |  Recompilation | 1 | Generate primitive type Byte[] from Integer in ternary expressions  | https://GitHub.com/leibnitz27/cfr/issues/349 | Reported|
| C-19 |  Recompilation | 1 | Generate wired Comparable cast expressions in ternary expression | https://GitHub.com/leibnitz27/cfr/issues/350 | Reported|
|     F-1  | Recompilation | 5 | Compilation error: incompatible types: possible lossy conversion from long to int | https://youtrack.jetbrains.com/issue/IDEA-291579 | Confirmed|
|     F-2  | Comparison | 27 | Incorrectly assign type byte to integer variables, which leads to different values printed | https://youtrack.jetbrains.com/issue/IDEA-299847 | Confirmed|
|     F-3  | Comparison | 2 | Generate var1\|=var2 for var1+=var2\|var1 only in nested loops | https://youtrack.jetbrains.com/issue/IDEA-291729 | Confirmed |
|     F-4  | Comparison | 1 | Incorrectly generate composite expressions containing parentheses, in reversed execution orders of their sub expressions| https://youtrack.jetbrains.com/issue/IDEA-291735 | Confirmed |
|     F-5  | Comparison | 1 | Different variables in the source code point to the same one in the generated code | https://youtrack.jetbrains.com/issue/IDEA-291807 | Confirmed |
|     F-6  | Comparison | 2 | Generate incorrect code for meaningless assignments (though meaningful when an exception is thrown) in try-catch blocks  | https://youtrack.jetbrains.com/issue/IDEA-291806 | Confirmed |
|    F-7 | Recompilation | 332 | Do not reuse existing variables from outer scopes when decompiling lambda expressions | https://youtrack.jetbrains.com/issue/IDEA-318084 | Confirmed |
|    F-8 | Recompilation | 101 | Lose type arguments when decompiling generic class declaration with implements | https://youtrack.jetbrains.com/issue/IDEA-318114 | Confirmed |
|    F-9 | Recompilation | 6 | Generate incorrect assignments when decompiling unused ternary expressions | https://youtrack.jetbrains.com/issue/IDEA-318284 | Reported |
|    F-10 | Recompilation | 14 | Lose type arguments when decompiling generic assignments with lambda expressions | https://youtrack.jetbrains.com/issue/IDEA-318289 | Reported |
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
|     J-21 | Decompilation  | 9 | Fail to decompile super invocations with null as parameters in constructors | https://GitHub.com/skylot/jadx/issues/1830 | Confirmed | 
|     J-22 | Decompilation  | 13 | Fail to decompile generic class type variables with inheritance relationship | https://GitHub.com/skylot/jadx/issues/1842 | Reported | 
|     J-23 | Recompilation  | 206 | Access the member fields of null assigned to variables of generic types | https://GitHub.com/skylot/jadx/issues/1828 | Fixed | 
|      J-24 | Recompilation  | 26 | Generate wired code from lambda expressions inlined in assignments | https://GitHub.com/skylot/jadx/issues/1829 | Fixed | 
|      J-25 | Recompilation  | 4 | Incorrectly simplify the comparison between float numbers and 0 | https://GitHub.com/skylot/jadx/issues/1838 | Fixed | 
|      J-26 | Recompilation  | 2 | Generate static variable initialization in a reversed order | https://GitHub.com/skylot/jadx/issues/1843 | Reported | 
|      J-27 | Recompilation  | 24 | Generate wired code for instantiation of generic types with null as their parameters | https://GitHub.com/skylot/jadx/issues/1844 | Reported | 
|      J-28 | Recompilation  | 2 | Generate undesirable cast expressions for assignments to member fields of instances of generic types | https://GitHub.com/skylot/jadx/issues/1855 | Reported | 
|      J-29 | Recompilation  | 13 | Generate wired reference of Class.this for instantiation using lambda expressions | https://GitHub.com/skylot/jadx/issues/1856 | Reported | 
|      J-30 | Recompilation  | 4 | Lose type arguments for instantiation of class types extending  other generic types | https://GitHub.com/skylot/jadx/issues/2002 | Reported | 
|      J-31 | Recompilation  | 20 | Generate wired instantiation using lambda expressions | https://GitHub.com/skylot/jadx/issues/2013 | Reported | 
|      J-32 | Recompilation  | 2 | Assign static final variables repeatedly when the assignments contain ternary expressions | https://GitHub.com/skylot/jadx/issues/2016 | Reported | 
|      J-33 | Recompilation  | 2 | Generate wrapper types from primitive types in cast expressions in generic class declarations | https://GitHub.com/skylot/jadx/issues/2017 | Reported | 
