class
Test
{
long
instanceCount
;
byte
byFld
=
97
;
double
dFld
;
int
iFld
=
-
39966
;
int
iMeth
(
int
i4
,
int
i5
)
{
int
i16
;
for
(
i16
=
3
;
i16
<
183
;
i16
++
)
instanceCount
+=
i16
-
instanceCount
;
long
meth_res
=
i4
;
return
(
int
)
meth_res
;
}
void
vSmallMeth
(
int
i3
,
double
d
)
{
i3
*=
iMeth
(
i3
,
i3
)
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
=
2
,
i21
,
i22
,
i24
;
float
f5
=
84.794F
;
vSmallMeth
(
i
,
dFld
)
;
i21
=
1
;
do
{
iFld
+=
i
;
f5
/=
instanceCount
;
instanceCount
+=
i21
^
instanceCount
;
for
(
i22
=
i21
;
i22
<
68
;
i22
++
)
{
i24
=
1
;
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
63
)
{
case
98
:
instanceCount
+=
iFld
;
case
75
:
break
;
default
:
byFld
+=
i24
;
}
}
}
while
(
++
i21
<
373
)
;
System
.
out
.
println
(
"f5 i21 i22 = "
+
Float
.
floatToIntBits
(
f5
)
+
","
+
i21
+
","
+
i22
)
;
System
.
out
.
println
(
"Test.instanceCount Test.bFld Test.byFld = "
+
instanceCount
+
","
+
0
+
","
+
byFld
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
for
(
;
;
)
_instance
.
mainTest
(
strArr
)
;
}
}
