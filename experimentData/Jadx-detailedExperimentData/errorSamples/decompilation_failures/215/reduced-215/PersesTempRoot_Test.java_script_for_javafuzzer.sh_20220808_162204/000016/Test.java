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
