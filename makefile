#makefile for Pets

all: Pets

Pets:
	javac Owner.java Attribute.java Pet.java Main.java Hedgehog.java Orca.java Happiness.java Hunger.java Filemanager.java

run:
	java Main

clean:
	rm *.class

jar: all
	jar cfm Pet.jar manifest.txt *.class
	java -jar Pet.jar
