# Bartosz.Sawicki@pw.edu.pl
# 2014-2023

ANTLR=./antlr-4.13.1-complete.jar

all: generate compile test

generate:
	java -jar $(ANTLR) -o output PleaseWork.g4

compile:
	javac -cp $(ANTLR):output:. Main.java

test:
	java -cp $(ANTLR):output:. Main testIf.x > testIf.ll
	lli testIf.ll

clean:
	rm -f testIf.ll
	rm -f *.class
	rm -rf output

