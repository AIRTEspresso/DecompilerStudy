public
class
Test
{
static
int
N
=
400
;
static
long
instanceCount
;
static
float
fFld
=
-
14.577F
;
public
short
sFld
;
public
int
iArrFld
;
boolean
bArrFld
;
static
long
iMeth1_check_sum
;
static
void
vMeth
(
)
{
long
l
=
9L
;
int
i10
=
53218
;
while
(
++
l
<
334
)
instanceCount
>>=
i10
;
}
static
int
iMeth1
(
int
i8
,
int
i9
)
{
int
i13
,
i14
,
i15
=
-
6
,
i16
=
28249
,
i17
=
14
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
double
d1
=
-
26.72589
;
short
s2
=
-
23582
;
init
(
iArr1
,
-
2
)
;
instanceCount
+=
(
long
)
(
-
17158L
*
(
fFld
-
i8
)
+
i9
)
;
vMeth
(
)
;
iArr1
[
i8
>
>
>
1
]
+=
instanceCount
;
i13
=
237
;
do
{
i9
=
(
int
)
d1
;
i8
-=
s2
;
iArr1
[
i13
]
|=
-
249
;
}
while
(
--
i13
>
0
)
;
for
(
i14
=
257
;
i14
>
4
;
--
i14
)
{
d1
+=
i14
;
i16
=
1
;
while
(
++
i16
<
6
)
i17
*=
instanceCount
;
}
long
meth_res
=
i8
+
i9
+
1
+
Double
.
doubleToLongBits
(
d1
)
+
s2
+
i14
+
i15
+
i16
+
i17
+
checkSum
(
iArr1
)
;
iMeth1_check_sum
+=
meth_res
;
return
(
int
)
meth_res
;
}
int
iMeth
(
short
s
)
{
int
i5
,
i6
,
i18
,
i19
,
i20
,
i21
=
-
28116
;
for
(
i5
=
3
;
i5
<
241
;
i5
+=
2
)
{
int
i7
=
-
14
;
i6
=
i7
-
iMeth1
(
i5
,
-
20685
)
;
for
(
i18
=
1
;
i18
<
13
;
++
i18
)
{
for
(
i20
=
1
;
i20
<
2
;
++
i20
)
{
i6
+=
62291
+
i20
;
instanceCount
=
i6
;
instanceCount
<<=
instanceCount
;
i6
+=
instanceCount
;
}
fFld
-=
i21
;
}
}
long
meth_res
=
s
;
return
(
int
)
meth_res
;
}
public
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
=
-
229
,
i1
,
i2
=
46
,
i3
,
i22
;
instanceCount
=
i
;
for
(
i1
=
238
;
i1
>
3
;
i1
--
)
{
for
(
i3
=
107
;
i3
>
4
;
i3
--
)
{
instanceCount
-=
iMeth
(
sFld
)
;
instanceCount
=
i3
;
}
for
(
i22
=
2
;
i22
<
107
;
++
i22
)
i2
+=
i22
+
i2
;
instanceCount
+=
i2
;
}
System
.
out
.
println
(
"iMeth1_check_sum: "
+
iMeth1_check_sum
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
void
init
(
)
{
}
static
void
init
(
int
[
]
a
,
int
seed
)
{
for
(
int
j
=
0
;
j
<
a
.
length
;
j
++
)
a
[
j
]
=
j
%
2
==
0
?
seed
+
j
:
seed
-
j
;
}
public
long
checkSum
(
int
[
]
a
)
{
long
sum
=
0
;
for
(
int
j
=
0
;
j
<
a
.
length
;
j
++
)
sum
+=
a
[
j
]
/
(
j
+
1
)
+
a
[
j
]
%
(
j
+
1
)
;
return
sum
;
}
}
