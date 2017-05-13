
lexer grammar ShelloidQueryLexer;

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
HAVING: 'HAVING';
SAMPLE: 'SAMPLE';
SETUP: 'SETUP';
TEARDOWN: 'TEARDOWN';
ON: 'ON';
EVERY: 'EVERY';
PRIORITY: 'PRIORITY';
ACTION: 'ACTION';
LET: 'LET';
LC : '{';
RC : '}';
LP: '(';
RP: ')';
INT: DIGIT+;
STRING: '\'' (ESC|.)*? '\'';
FLOAT: DIGIT+ '.' DIGIT+ | '.' DIGIT+;
DIV: '/';
MUL : '*';
MOD: '%';
PLUS: '+';
MINUS: '-';
EQ: '=';
AND: 'AND';
OR: 'OR';
NOT: 'NOT';
LT : '<';
GT : '>';
GTE : '>=';
LTE : '<=';
NEQ  : '<>';
DOT : '.';
ID:  (LETTER | '$' |'_') (LETTER | DIGIT | '$' | '-' | '_' | '?' | '!')*;
WS : [ \r\n\t]+ -> skip;
COMMENT : (('/*' .*? '*/') | ('//' .*? '\n')) -> skip;
COMMA: ',';
SEMI: ';';

fragment
ESC : '\\\'' | '\\\\';
LETTER : [a-zA-Z];
DIGIT  : [0-9];
