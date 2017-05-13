java -jar c:\databases\antlr-4.5-complete.jar  -package "com.shelloid.query" ShelloidQueryLexer.g4
java -jar c:\databases\antlr-4.5-complete.jar  -package "com.shelloid.query" ShelloidQueryParser.g4
javac -cp c:\databases\antlr-4.5-complete.jar -d ..\..\..\..\..\target\classes *.java
REM call grun ShelloidQuery script ..\..\test\grammar\query1.shq