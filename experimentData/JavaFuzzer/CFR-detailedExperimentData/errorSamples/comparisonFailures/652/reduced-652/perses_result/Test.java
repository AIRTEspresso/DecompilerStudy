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
{
init
(
iArrFld
,
189
)
;
}
long
vMeth_check_sum
;
void
vMeth
(
long
l
,
int
i2
,
long
l1
)
{
int
i3
,
i4
,
i5
=
-
104
;
i3
=
1
;
do
for
(
i4
=
1
;
i4
<
5
;
i4
++
)
l1
+=
iArrFld
[
i3
]
--
-
i3
;
while
(
++
i3
<
372
)
;
vMeth_check_sum
+=
l
+
i2
+
l1
+
i3
+
i4
+
i5
;
}
int
iMeth
(
int
i6
)
{
int
i7
=
-
50050
,
i8
,
i9
;
byte
by
=
33
;
boolean
b1
=
true
;
short
s
=
5878
;
vMeth
(
1555838649L
,
-
8
,
instanceCount
)
;
do
i6
=
i7
;
while
(
++
i7
<
368
)
;
i8
=
1
;
while
(
++
i8
<
125
)
{
s
+=
i8
^
i7
;
s
+=
i7
;
}
i9
=
1
;
while
(
++
i9
<
134
)
{
i6
=
-
33279
;
i6
-=
14L
;
if
(
b1
)
break
;
}
long
meth_res
=
i6
+
i7
+
by
+
1
+
i8
+
s
+
i9
;
return
(
int
)
meth_res
;
}
long
lMeth
(
int
i
)
{
int
i1
=
-
5
;
instanceCount
=
i1
;
vMeth
(
Math
.
min
(
instanceCount
,
(
long
)
(
i1
-
-
1.472F
)
<
<
iMeth
(
45840
)
)
,
i1
,
0L
)
;
long
meth_res
=
i
;
return
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
instanceCount
-=
lMeth
(
iFld
)
;
System
.
out
.
println
(
"vMeth_check_sum: "
+
vMeth_check_sum
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
}