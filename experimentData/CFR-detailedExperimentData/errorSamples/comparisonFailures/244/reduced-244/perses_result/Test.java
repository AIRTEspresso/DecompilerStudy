class
Test
{
int
N
=
400
;
long
instanceCount
;
int
iFld
;
float
fFld
;
double
dFld
;
long
lArrFld
[
]
=
new
long
[
N
]
;
void
vMeth1
(
short
s
)
{
int
i7
,
i8
,
i10
,
iArr1
[
]
=
new
int
[
N
]
;
for
(
i8
=
6
;
i8
<
128
;
++
i8
)
{
i10
=
1
;
do
iArr1
[
i8
]
*=
fFld
;
while
(
++
i10
<
13
)
;
}
iFld
=
i8
;
}
void
vMeth
(
int
i5
,
int
i6
)
{
short
s1
=
30748
;
vMeth1
(
s1
)
;
}
int
iMeth
(
int
i2
)
{
long
l
;
l
=
1
;
do
{
vMeth
(
iFld
,
i2
)
;
iFld
-=
l
;
}
while
(
++
l
<
5
)
;
long
meth_res
=
i2
;
return
(
int
)
meth_res
;
}
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
9
,
i17
=
14
,
i19
;
short
s2
=
32408
;
double
d2
;
for
(
i
=
14
;
i
<
295
;
++
i
)
{
i1
-=
iMeth
(
iFld
)
;
for
(
i17
=
5
;
i17
<
89
;
++
i17
)
{
iFld
-=
i
;
i1
=
i
;
}
}
i1
+=
i17
;
for
(
i19
=
6
;
395
>
i19
;
i19
++
)
lArrFld
[
i19
]
=
(
long
)
dFld
;
for
(
d2
=
2
;
d2
<
370
;
++
d2
)
{
fFld
=
s2
;
instanceCount
-=
i1
;
}
instanceCount
-=
i19
;
System
.
out
.
println
(
"Test.instanceCount Test.iFld Test.fFld = "
+
instanceCount
+
","
+
iFld
+
","
+
Float
.
floatToIntBits
(
fFld
)
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
