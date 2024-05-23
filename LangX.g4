grammar LangX;

prog: ( stat? NEWLINE )* 
;

stat: ID ' = ' boolexpr0  #assignBool
    | ID ' = ' expr0      #assign
	| PRINT ID   		#print
	| READ ID           #read
;

expr0:  expr1			#single0
      | expr0 ADD expr1	#add
      | expr0 SUB expr1 #sub
;

expr1:  expr2			#single1
      | expr1 MULT expr2	#mult
      | expr1 DIV expr2 #div
;

expr2:   INT			#int
       | REAL           #real
       | ID             #id
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;	

boolexpr0:  NEG boolexpr1               #neg
        |   boolexpr1 AND boolexpr0     #and
        |   boolexpr1 OR boolexpr0      #or
        |   boolexpr1 XOR boolexpr0     #xor
        |   boolexpr1                   #singlebool0
        ;


boolexpr1: BOOL                 #bool
        |  ID                   #idb
        |  '(' boolexpr0 ')'    #parb
        ;

compare:  EQUALS        #equals
        | NOTEQUALS     #notequals
        | GREATERTHAN   #greaterthan
        | LESSTHAN      #lessthan
        ;

EQUALS: ' == ';

NOTEQUALS: ' != ';

GREATERTHAN: ' >= ';

LESSTHAN: ' <= ';

GREATER: ' > ';

LESS: ' < ';

BOOL : ('true'|'false')
    ;


AND: ' && '
    ;

OR: ' || '
    ;

XOR: ' ^ '
    ;

NEG: '!'
    ;

READ:	'read '
    ;

PRINT:	'print '
    ;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

REAL: '-'?'0'..'9'+'.''0'..'9'+
    ;

INT: '-'?'0'..'9'+
    ;

SUB: ' - '
    ;

ADD: ' + '
    ;

MULT: ' * '
    ;

DIV: ' / '
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
