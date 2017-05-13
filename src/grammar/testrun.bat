call antlr4  ShelloidQueryLexer.g4
call antlr4 ShelloidQueryParser.g4
javac  *.java
call grun ShelloidQuery query -gui ..\test\grammar\query2.shq
del *.class
del *.java