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
Object
[
]
a
,
Object
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
try
{
a
[
j
]
=
seed
.
getClass
(
)
.
newInstance
(
)
;
}
catch
(
Exception
ex
)
{
a
[
j
]
=
seed
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
public
static
int
[
]
int1array
(
int
sz
,
int
seed
)
{
int
[
]
ret
=
new
int
[
sz
]
;
init
(
ret
,
seed
)
;
return
ret
;
}
}
