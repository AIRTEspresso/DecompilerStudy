class
Test
{
int
N
=
400
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
-
130
,
i20
,
i21
=
51760
,
iArr
[
]
=
new
int
[
N
]
;
float
f
=
0.48F
;
i
=
1
;
do
{
f
*=
i1
++
;
for
(
i20
=
5
;
i20
<
186
;
++
i20
)
{
i1
+=
i20
|
i21
;
iArr
[
i20
]
-=
i1
;
}
}
while
(
++
i
<
135
)
;
System
.
out
.
println
(
"i f i1 = "
+
i
+
","
+
Float
.
floatToIntBits
(
f
)
+
","
+
i1
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