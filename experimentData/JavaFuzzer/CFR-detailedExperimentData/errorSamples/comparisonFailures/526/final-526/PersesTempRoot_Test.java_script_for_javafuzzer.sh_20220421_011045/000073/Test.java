import
java
.
util
.
concurrent
.
atomic
.
AtomicLong
;
import
java
.
io
.
PrintStream
;
import
java
.
util
.
Random
;
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
,
i11
=
-
43990
,
i12
=
-
49450
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
init
(
iArr
,
-
10737
)
;
l
=
1
;
while
(
++
l
<
334
)
{
for
(
i10
=
1
;
i10
<
5
;
i10
++
)
{
switch
(
(
(
1
>
>
>
1
)
%
2
)
+
33
)
{
case
33
:
Test
.
instanceCount
>>=
i10
;
break
;
case
34
:
if
(
i10
!=
0
)
{
vMeth_check_sum
+=
l
+
i10
+
i11
+
Double
.
doubleToLongBits
(
d
)
+
i12
+
s1
+
checkSum
(
iArr
)
;
return
;
}
default
:
try
{
i11
=
(
1181301283
%
i11
)
;
i11
=
(
i10
%
68
)
;
i11
=
(
28311
/
i11
)
;
}
catch
(
ArithmeticException
a_e
)
{
}
}
i11
+=
13
;
i11
-=
i11
;
for
(
d
=
1
;
d
<
2
;
d
++
)
{
iArr
[
(
int
)
(
l
-
1
)
]
<<=
s1
;
i11
+=
(
int
)
(
(
long
)
d
^
i11
)
;
i12
+=
(
int
)
d
;
i11
+=
(
int
)
(
(
(
d
*
l
)
+
s1
)
-
i10
)
;
i11
+=
(
int
)
(
(
(
d
*
i10
)
+
i11
)
-
i11
)
;
i11
-=
i10
;
}
}
}
vMeth_check_sum
+=
l
+
i10
+
i11
+
Double
.
doubleToLongBits
(
d
)
+
i12
+
s1
+
checkSum
(
iArr
)
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
b
=
Test
.
bArrFld
[
(
i9
>
>
>
1
)
%
N
]
;
Test
.
instanceCount
+=
(
long
)
(
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
{
if
(
i15
!=
0
)
{
}
iArr1
[
i14
-
1
]
^=
(
int
)
10L
;
i17
*=
(
int
)
Test
.
instanceCount
;
Test
.
bArrFld
[
i14
-
1
]
=
b
;
}
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
i13
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
init
(
iArr2
,
118
)
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
|=
i7
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
i19
=
i20
;
Test
.
instanceCount
=
i6
;
s
*=
(
short
)
i5
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
i7
-=
-
47773
;
iArr2
[
i18
-
1
]
=
-
99
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
iMeth_check_sum
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
void
mainTest
(
String
[
]
strArr1
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
byFld
=
(
byte
)
Test
.
instanceCount
;
Test
.
instanceCount
-=
i3
;
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
{
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
for
(
i24
=
i22
;
i24
<
2
;
++
i24
)
{
i2
+=
(
int
)
Test
.
fFld
;
i4
>>>=
i2
;
i4
*=
(
int
)
d2
;
i
+=
(
30
+
(
i24
*
i24
)
)
;
byArr
[
i1
+
1
]
>>=
(
byte
)
Test
.
instanceCount
;
d2
+=
i25
;
}
}
for
(
i26
=
2
;
i26
<
107
;
++
i26
)
{
iArrFld
[
i26
+
1
]
+=
(
int
)
Test
.
fFld
;
Test
.
instanceCount
+=
i2
;
switch
(
(
i26
%
2
)
+
125
)
{
case
125
:
i28
=
1
;
do
{
iArrFld
[
i28
]
=
i4
;
i27
-=
-
19805
;
i
-=
-
64306
;
switch
(
(
(
i28
%
2
)
*
5
)
+
50
)
{
case
52
:
i25
=
i1
;
if
(
b1
)
{
}
Test
.
fFld
=
i25
;
i4
+=
i4
;
break
;
case
56
:
default
:
Test
.
instanceCount
+=
(
i28
*
i28
)
;
}
}
while
(
++
i28
<
2
)
;
case
126
:
}
}
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
try
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
catch
(
Exception
ex
)
{
System
.
out
.
println
(
ex
.
getClass
(
)
.
getCanonicalName
(
)
)
;
}
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
{
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
:
(
j
%
3
==
0
)
;
}
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
{
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
}
public
static
void
init
(
byte
[
]
a
,
byte
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
{
a
[
j
]
=
(
byte
)
(
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
)
;
}
}
public
static
long
checkSum
(
boolean
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
{
sum
+=
(
a
[
j
]
?
j
+
1
:
0
)
;
}
return
sum
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
{
sum
+=
(
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
)
;
}
return
sum
;
}
public
static
long
checkSum
(
byte
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
{
sum
+=
(
byte
)
(
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
)
;
}
return
sum
;
}
}
