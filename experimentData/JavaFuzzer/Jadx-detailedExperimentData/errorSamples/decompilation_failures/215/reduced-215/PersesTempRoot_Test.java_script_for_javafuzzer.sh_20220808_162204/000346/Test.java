public
class
Test
{
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
int
iMeth
(
)
{
int
i6
=
-
93
;
boolean
b2
=
false
;
long
meth_res
=
i6
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
=
i2
;
switch
(
i
)
{
case
114
:
switch
(
i
%
8
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
case
7
:
i1
<<=
i18
;
}
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
}
}
