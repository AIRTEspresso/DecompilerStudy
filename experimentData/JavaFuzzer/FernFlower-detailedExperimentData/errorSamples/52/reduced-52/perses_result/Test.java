class
Test
{
byte
byFld
=
-
92
;
short
sFld
=
-
8562
;
void
mainTest
(
String
[
]
strArr1
)
{
int
i
,
i1
=
10
,
i21
,
i22
=
-
14
,
i23
,
i24
=
12
,
i25
=
52818
;
long
l
=
-
3L
,
l4
=
13L
;
i
=
1
;
while
(
++
i
<
205
)
{
l
>>=
i1
;
for
(
i21
=
7
;
i21
<
122
;
i21
++
)
i22
+=
i21
;
i22
+=
sFld
;
}
i1
=
byFld
;
i1
*=
i22
;
i23
=
1
;
do
{
i1
+=
i23
;
switch
(
i23
%
2
+
116
)
{
case
116
:
for
(
i24
=
i23
;
115
>
i24
;
i24
++
)
i1
+=
i24
|
i1
;
}
}
while
(
++
i23
<
219
)
;
System
.
out
.
println
(
"i i1 l = "
+
i
+
","
+
i1
+
","
+
l
)
;
System
.
out
.
println
(
"i24 i25 l4 = "
+
i24
+
","
+
i25
+
","
+
l4
)
;
}
public
static
void
main
(
String
[
]
strArr
)
{
Test
_instance
=
new
Test
(
)
;
_instance
.
mainTest
(
strArr
)
;
}
}