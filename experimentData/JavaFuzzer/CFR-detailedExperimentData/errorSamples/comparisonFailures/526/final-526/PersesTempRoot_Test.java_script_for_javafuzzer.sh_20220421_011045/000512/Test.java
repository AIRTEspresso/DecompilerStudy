public
class
Test
{
public
static
final
int
N
=
400
;
public
static
long
instanceCount
=
10205L
;
public
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
=
-
16976
;
public
byte
byFld
=
-
52
;
public
int
iArrFld
[
]
=
new
int
[
N
]
;
public
static
boolean
bArrFld
[
]
=
new
boolean
[
N
]
;
static
{
init
(
Test
.
bArrFld
,
true
)
;
}
public
static
long
iMeth_check_sum
=
0
;
public
static
long
iMeth1_check_sum
=
0
;
public
static
long
vMeth_check_sum
=
0
;
public
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
-
53218
;
double
d
=
-
1.26682
;
short
s1
=
30694
;
while
(
++
l
<
334
)
Test
.
instanceCount
>>=
i10
;
}
public
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
boolean
b
=
true
;
int
i13
=
-
226
,
i14
=
-
6
,
i15
=
-
6
,
i16
=
-
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
Test
.
instanceCount
+=
(
-
17158L
*
(
Test
.
fFld
-
i8
)
)
+
(
i9
++
)
;
vMeth
(
)
;
iArr1
[
(
i8
>
>
>
1
)
%
N
]
+=
(
int
)
Test
.
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
(
int
)
Test
.
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
(
b
?
1
:
0
)
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
public
static
int
iMeth
(
short
s
)
{
int
i5
=
31
,
i6
=
154
,
i18
=
22208
,
i19
=
-
14
,
i20
=
0
,
i21
=
-
28116
,
iArr2
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
(
(
i7
++
)
+
(
(
i6
-
i6
)
-
iMeth1
(
i5
,
-
20685
)
)
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
(
62291
+
(
i20
*
i20
)
)
;
Test
.
instanceCount
=
i6
;
i19
+=
i20
;
Test
.
instanceCount
<<=
Test
.
instanceCount
;
i6
+=
(
int
)
Test
.
instanceCount
;
}
Test
.
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
+
i5
+
i6
+
i18
+
i19
+
i20
+
i21
+
checkSum
(
iArr2
)
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
=
-
26146
,
i2
=
46
,
i3
=
-
160
,
i4
=
-
57288
,
i22
=
13
,
i23
=
1
;
double
d2
=
2.80172
;
boolean
b1
=
false
;
byte
byArr
[
]
=
new
byte
[
N
]
;
Test
.
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
i4
=
(
int
)
(
Test
.
instanceCount
-=
(
iArrFld
[
i1
]
*
iMeth
(
sFld
)
)
)
;
Test
.
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
(
(
(
i22
*
i23
)
+
i2
)
-
i3
)
;
Test
.
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
public
static
void
init
(
boolean
[
]
a
,
boolean
seed
)
{
}
public
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
(
j
%
2
==
0
)
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
static
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
