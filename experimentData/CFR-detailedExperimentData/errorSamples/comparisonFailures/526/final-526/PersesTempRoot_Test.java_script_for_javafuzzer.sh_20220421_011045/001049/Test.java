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
short
sFld
;
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
