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
for
(
i4
=
1
;
i4
<
2
;
i4
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
switch
(
(
(
i
%
5
)
*
5
)
+
106
)
{
case
114
:
i5
-=
(
int
)
Test
.
instanceCount
;
i18
+=
(
(
(
i17
*
Test
.
instanceCount
)
+
i3
)
-
i5
)
;
switch
(
(
i
%
8
)
+
112
)
{
case
112
:
Test
.
instanceCount
>>=
i4
;
case
113
:
Test
.
instanceCount
-=
i18
;
break
;
case
114
:
Test
.
byFld
=
(
byte
)
Test
.
dFld
;
Test
.
fFld
+=
i
;
case
115
:
case
116
:
i1
+=
i
;
switch
(
(
(
i18
>
>
>
1
)
%
5
)
+
4
)
{
case
4
:
case
5
:
iArrFld
[
i2
]
-=
(
int
)
Test
.
instanceCount
;
break
;
case
6
:
if
(
b3
)
break
;
case
7
:
Test
.
instanceCount
+=
s
;
i3
+=
(
i17
-
iFld
)
;
i1
<<=
i18
;
Test
.
fFld
+=
(
i17
*
i17
)
;
break
;
case
8
:
i1
<<=
iFld
;
break
;
}
break
;
case
117
:
i3
=
i5
;
break
;
case
118
:
try
{
i1
=
(
iArrFld
[
i17
]
/
59710
)
;
i3
=
(
i2
/
-
7014
)
;
i3
=
(
294254790
%
i2
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
break
;
case
119
:
i18
-=
-
8
;
}
break
;
}
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
