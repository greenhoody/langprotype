x = 5
z = 7
y = true

if y then
print z
endif

if !y then
print x
endif

if y && true then
print z
endif

if false || false then
print x
endif

if true ^ false then
print z
endif

if true ^ true then
print x
endif

