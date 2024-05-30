t = 3
real function nazwafunkcji then
    cos = 3.0
    loop t
        print cos
        cos = cos + 1.0
    endloop
    nazwafunkcji = cos
endfunction



f = nazwafunkcji
print f


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


x = 5
z = 3
z = 7
y = true

if y then
print x
endif

if !y then
print z
endif

if true ^ false then
print z
endif


loop 2
print x
endloop
