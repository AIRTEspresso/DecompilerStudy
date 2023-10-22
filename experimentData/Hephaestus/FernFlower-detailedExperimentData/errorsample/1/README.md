# Bug1


[Link](https://youtrack.jetbrains.com/issue/IDEA-318084/FernFlower-generates-incorrect-code-for-lambda-expression-it-may-be-related-to-functional-type).

Error message:

``` txt
./Demo.java:3: warning: [removal] Long(long) in Long has been deprecated and marked for removal
      Long var2 = new Long(55L);
                  ^
./Demo.java:5: error: variable var2 is already defined in method foo1(Number)
         Integer var2 = (Integer)null;
                 ^
1 error
1 warning
```
