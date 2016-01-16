JCC = javac
JDIR = -d
CPATH = -classpath

default: SixNimmt.class
	
SixNimmt.class:
	$(JCC) $(JDIR) src $(CPATH) src src/Card.java
	$(JCC) $(JDIR) src $(CPATH) src src/Deck.java
	$(JCC) $(JDIR) src $(CPATH) src src/Player.java
	$(JCC) $(JDIR) src $(CPATH) src src/Row.java
	$(JCC) $(JDIR) src $(CPATH) src src/Game.java
	$(JCC) $(JDIR) src $(CPATH) src src/SixNimmt.java

clean:
	rm -f src/*.class
	rm -f src/sn/*.class

run:
	java $(CPATH) src SixNimmt ${V}

