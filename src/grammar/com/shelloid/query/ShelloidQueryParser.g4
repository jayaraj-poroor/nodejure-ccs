parser grammar ShelloidQueryParser;

options {tokenVocab = ShelloidQueryLexer;}

query: 			SELECT selectClause 
				FROM fromClause 
				(LET letClause)?
				(WHERE whereClause)? 
				(SETUP setupClause)?
				(TEARDOWN teardownClause)?
				(ACTION actionClause)?
				SAMPLE samplingClause
				(PRIORITY priority)?
				;

samplingClause: (EVERY samplingPeriod | ON samplingEvents);
samplingPeriod: INT;
samplingEvents: ID (COMMA ID)*;

priority: INT;

selectClause: 	selectTerm (COMMA selectTerm)*;

qualifiedName: 	ID (DOT ID)*;
simpleName: 	ID;
literal: 		INT | FLOAT | STRING;
paramList: 		qualifiedName (COMMA qualifiedName)*;

selectTerm : 	qualifiedName | simpleName LP paramList RP;

fromClause: 	simpleName;

arithExpr:		qualifiedName 					|
				literal 						| 
				functionCallExpr				|
				arithExpr op=PLUS arithExpr		|	
				arithExpr op=MINUS arithExpr 	|
				arithExpr op=MUL arithExpr		|
				arithExpr op=DIV arithExpr		|
				arithExpr op=MOD arithExpr		|				
				op=MINUS arithExpr				|
				LP arithExpr RP;

functionCallExpr: simpleName LP commonExpr? (COMMA commonExpr)* RP;				

commonExpr: arithExpr | booleanExpr;

relationalExpr: arithExpr op=GT arithExpr 	| 
				arithExpr op=LT arithExpr 	| 
				arithExpr op=GTE arithExpr  | 
				arithExpr op=LTE arithExpr  | 
				arithExpr op=EQ arithExpr 	|
				arithExpr op=NEQ arithExpr	|
				LP relationalExpr RP;

booleanExpr: 	relationalExpr 					| 
				booleanExpr op=OR booleanExpr 	|
				booleanExpr op=AND booleanExpr 	| 
				op=NOT booleanExpr 				| 
				LP booleanExpr RP;

letClause:      simpleName EQ literal (COMMA simpleName EQ literal)*;
				
whereClause: 	booleanExpr;

setupClause: actionClause;
teardownClause: actionClause;
actionClause: LC script RC;
script: (functionCallExpr SEMI)*;
