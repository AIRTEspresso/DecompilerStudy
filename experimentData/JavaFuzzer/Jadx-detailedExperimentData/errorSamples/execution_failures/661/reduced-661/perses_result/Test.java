class
Test
{
int
N
=
400
;
float
fFld
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
i21
,
i23
=
10
,
i24
;
float
fArr
[
]
[
]
=
new
float
[
N
]
[
N
]
;
init
(
fArr
,
-
114.1013F
)
;
for
(
i21
=
11
;
i21
<
382
;
i21
++
)
switch
(
(
i21
%
9
)
*
5
+
20
)
{
case
30
:
i23
=
1
;
do
i24
=
1
;
while
(
++
i23
<
68
)
;
case
35
:
break
;
case
65
:
i21
=
(
int
)
fFld
;
case
52
:
fArr
[
i21
]
[
i21
+
1
]
+=
i23
;
}
System
.
out
.
println
(
"fArr = "
+
Double
.
doubleToLongBits
(
checkSum
(
fArr
)
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
void
init
(
float
[
]
a
,
float
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
void
init
(
float
[
]
[
]
a
,
float
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
double
checkSum
(
float
[
]
a
)
{
double
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
double
checkSum
(
float
[
]
[
]
a
)
{
double
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
checkSum
(
a
[
j
]
)
;
return
sum
;
}
}
