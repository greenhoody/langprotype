 
t = 3
real function nazwafunkcji then
    cos = 3.0
    loop t
        print cos
        cos = cos + 0.3
    endloop
    nazwafunkcji = cos
endfunction

real function funkcjadwa then
    cos = -3.0
    loop t
        print cos
        cos = cos - 1.0
    endloop
    funkcjadwa = cos
endfunction

g = funkcjadwa
print g

f = nazwafunkcji
print f

bool function prawda then
    prawda = true
endfunction


real function testowa then
    cos = 12.0
    h = -100
    bug = funkcjadwa
    print h
    print cos
    testowa = cos * bug
endfunction

l = testowa
print l

x = 5
y = true

if prawda then
print x
endif
