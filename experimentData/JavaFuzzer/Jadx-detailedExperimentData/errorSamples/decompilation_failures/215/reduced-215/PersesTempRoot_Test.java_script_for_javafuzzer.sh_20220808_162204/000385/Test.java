public
class
Test
{
public
static
long
instanceCount
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
i4
=
-
171
,
i18
=
48841
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
)
{
case
112
:
instanceCount
>>=
i4
;
case
113
:
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
)
{
}
public
static
void
init
(
double
seed
)
{
}
}
