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
-
9L
;
public
int
iFld
=
7
;
public
static
double
dFld
=
-
66.79636
;
public
static
byte
byFld
=
17
;
public
static
float
fFld
=
-
1.628F
;
public
static
double
dArrFld
[
]
[
]
=
new
double
[
N
]
[
N
]
;
public
static
byte
byArrFld
[
]
=
new
byte
[
N
]
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
long
lArrFld
[
]
[
]
[
]
=
new
long
[
N
]
[
N
]
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
lMeth_check_sum
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
int
i7
,
float
f1
)
{
int
i8
=
229
,
i9
=
1
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
boolean
b
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
init
(
iArr
,
-
12
)
;
init
(
byArr
,
(
byte
)
-
51
)
;
iArr
[
(
i7
>
>
>
1
)
%
N
]
<<=
-
224
;
for
(
i8
=
15
;
i8
<
305
;
++
i8
)
{
if
(
i7
!=
0
)
{
vMeth_check_sum
+=
i7
+
Float
.
floatToIntBits
(
f1
)
+
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
checkSum
(
iArr
)
+
checkSum
(
byArr
)
;
return
;
}
}
f1
-=
i9
;
b
=
b
;
iArr
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
=
i8
;
byArr
[
(
14
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
byte
)
i8
;
vMeth_check_sum
+=
i7
+
Float
.
floatToIntBits
(
f1
)
+
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
checkSum
(
iArr
)
+
checkSum
(
byArr
)
;
}
public
static
long
lMeth
(
)
{
int
i10
=
29128
,
i11
=
-
36993
,
i12
=
-
232
,
i13
=
-
152
,
i14
=
-
12
,
iArr1
[
]
[
]
=
new
int
[
N
]
[
N
]
;
float
f2
=
-
42.418F
;
boolean
b1
=
true
;
init
(
iArr1
,
88
)
;
vMeth
(
i10
,
f2
)
;
for
(
i11
=
160
;
i11
>
10
;
i11
-=
2
)
{
switch
(
(
(
i10
>
>
>
1
)
%
2
)
+
50
)
{
case
50
:
i10
+=
(
i11
|
i12
)
;
iArr1
[
i11
]
=
iArr1
[
i11
]
;
break
;
case
51
:
i13
=
1
;
while
(
(
i13
+=
2
)
<
21
)
{
if
(
i12
!=
0
)
{
}
Test
.
instanceCount
+=
(
long
)
f2
;
i14
=
1
;
do
{
i12
-=
i13
;
i12
+=
(
(
(
i14
*
Test
.
instanceCount
)
+
i13
)
-
Test
.
instanceCount
)
;
i10
=
(
int
)
Test
.
instanceCount
;
i10
|=
-
17009
;
Test
.
instanceCount
+=
(
(
(
i14
*
i12
)
+
i11
)
-
Test
.
byFld
)
;
}
while
(
++
i14
<
3
)
;
Test
.
bArrFld
[
i11
-
1
]
=
b1
;
}
break
;
default
:
if
(
b1
)
break
;
}
}
long
meth_res
=
i10
+
Float
.
floatToIntBits
(
f2
)
+
i11
+
i12
+
i13
+
i14
+
(
b1
?
1
:
0
)
+
checkSum
(
iArr1
)
;
lMeth_check_sum
+=
meth_res
;
return
(
long
)
meth_res
;
}
public
int
iMeth
(
)
{
float
f
=
-
101.128F
,
f3
=
-
35.345F
;
int
i6
=
-
93
,
i15
=
-
9297
,
i16
=
-
21449
;
boolean
b2
=
false
;
switch
(
(
(
(
iFld
-
iFld
)
>
>
>
1
)
%
8
)
+
68
)
{
case
68
:
Test
.
dFld
*=
Test
.
instanceCount
;
Test
.
byArrFld
=
(
Test
.
byArrFld
=
(
Test
.
byArrFld
=
Test
.
byArrFld
)
)
;
iArrFld
[
(
iFld
>
>
>
1
)
%
N
]
=
(
int
)
(
(
iFld
=
(
int
)
(
Test
.
dFld
+
iFld
)
)
-
Test
.
instanceCount
)
;
break
;
case
69
:
Test
.
instanceCount
*=
(
long
)
(
(
(
-
(
-
67.104506
-
(
--
Test
.
instanceCount
)
)
)
+
(
Test
.
instanceCount
+
iFld
)
)
+
lArrFld
[
(
-
24541
>
>
>
1
)
%
N
]
[
(
iFld
>
>
>
1
)
%
N
]
[
(
iFld
>
>
>
1
)
%
N
]
)
;
break
;
case
70
:
for
(
f
=
190
;
1
<
f
;
--
f
)
{
i6
-=
Math
.
max
(
iFld
,
iArrFld
[
(
int
)
(
f
)
]
)
;
iFld
=
(
int
)
lMeth
(
)
;
if
(
false
)
break
;
Test
.
instanceCount
*=
i6
;
i6
+=
(
int
)
(
(
(
f
*
f
)
+
Test
.
instanceCount
)
-
Test
.
instanceCount
)
;
if
(
b2
)
break
;
}
for
(
i15
=
4
;
197
>
i15
;
i15
++
)
{
Test
.
dFld
=
-
11
;
if
(
false
)
continue
;
}
break
;
case
71
:
Test
.
dFld
=
i6
;
break
;
case
72
:
case
73
:
f3
*=
(
float
)
Test
.
dFld
;
break
;
case
74
:
i16
+=
i15
;
break
;
case
75
:
iFld
|=
i15
;
break
;
}
long
meth_res
=
Float
.
floatToIntBits
(
f
)
+
i6
+
(
b2
?
1
:
0
)
+
i15
+
i16
+
Float
.
floatToIntBits
(
f3
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
int
i
=
49
,
i1
=
57891
,
i2
=
-
52195
,
i3
=
-
2
,
i4
=
-
171
,
i5
=
-
11368
,
i17
=
-
240
,
i18
=
48841
;
double
d
=
-
1.122010
;
boolean
b3
=
true
;
short
s
=
15486
;
for
(
i
=
4
;
i
<
364
;
i
++
)
for
(
i2
=
3
;
70
>
i2
;
i2
++
)
{
i1
<<=
i3
;
Test
.
instanceCount
=
(
-
(
++
Test
.
instanceCount
)
)
;
Test
.
dArrFld
[
i2
+
1
]
[
i4
-
1
]
-=
iMeth
(
)
;
i3
=
(
int
)
Test
.
dFld
;
i1
=
i2
;
}
System
.
out
.
println
(
"i i1 i2 = "
+
i
+
","
+
i1
+
","
+
i2
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
int
[
]
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
init
(
a
[
j
]
,
seed
)
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
void
init
(
double
[
]
a
,
double
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
double
[
]
[
]
a
,
double
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
init
(
a
[
j
]
,
seed
)
;
}
}
public
static
long
checkSum
(
Object
a
)
{
if
(
a
==
null
)
return
0L
;
return
(
long
)
a
.
getClass
(
)
.
getCanonicalName
(
)
.
length
(
)
;
}
}
