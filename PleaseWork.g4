grammar PleaseWork;

prog: ( (stat|function)? NEWLINE )*
;

block: ( stat? NEWLINE )*
;

blockif: block;

fblock: block;

function: FUNCTION fparam fblock ENDFUNCTION;

stat: ID ' = ' expr0    #assign
    | IF expr0 THEN blockif ENDIF	#if
	| PRINT ID   		#print
	| READ ID           #read
;


expr0:    expr0 ADD expr1 #add
        | expr0 SUB expr1 #sub
        | NEG expr1       #neg
        | expr1 AND expr0 #and
        | expr1 OR  expr0 #or
        | expr1 XOR expr0 #xor
        | expr1			#single0
        ;


expr1:  expr2			#single1
      | expr1 MULT expr2	#mult
      | expr1 DIV expr2 #div
;

expr2:   INT			#int
       | REAL           #real
       | BOOL           #bool
       | ID             #id
       | TOINT expr2		#toint
       | TOREAL expr2		#toreal
       | '(' expr0 ')'		#par
;	


compare:  EQUALS        #equals
        | NOTEQUALS     #notequals
        | GREATERTHAN   #greaterthan
        | LESSTHAN      #lessthan
        ;

FUNCTION: 'function';

ENDFUNCTION:	'endfunction';

IF:	'if';

THEN: 'then';

ENDIF: 'endif';

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
