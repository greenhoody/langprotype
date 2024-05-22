// Demo for two types expression grammar
// Bartosz Sawicki, 2014-2023

grammar LangX;

prog: ( stat? NEWLINE )* 
;

stat:	 ID '=' expr0		#assign
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


READ:	'read'
    ;

PRINT:	'print' 
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

SUB: '-'
    ;

ADD: '+'
    ;

MULT: '*'
    ;

DIV: '/'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;
