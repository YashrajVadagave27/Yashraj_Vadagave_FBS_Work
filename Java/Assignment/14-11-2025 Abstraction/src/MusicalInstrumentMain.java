abstract class MusicalInstrument {
    String name;
    String type;
    double price;
    static int instrumentCount = 0;

    MusicalInstrument() {
        System.out.println("MusicalInstrument Default Constructor Called");
        this.name = "Unknown";
        this.type = "Unknown";
        this.price = 0.0;
        instrumentCount++;
    }

    MusicalInstrument(String name, String type, double price) {
        System.out.println("MusicalInstrument Parameterized Constructor Called");
        this.name = name;
        this.type = type;
        this.price = price;
        instrumentCount++;
    }

    String getName() { 
    	return name; 
    }
    void setName(String name) { 
    	this.name = name; 
    }

    String getType() { 
    	return type; 
    }
    void setType(String type) { 
    	this.type = type; 
    }

    double getPrice() { 
    	return price; 
    }
    void setPrice(double price) { 
    	this.price = price; 
    }

    static int getInstrumentCount() { 
    	return instrumentCount; 
    }

    abstract void play();

    void display() {
        System.out.println("Instrument Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
    }
}//musicalinstrument ends here

class Guitar extends MusicalInstrument {
    int strings;

    Guitar() {
        super();
        System.out.println("Guitar Default Constructor Called");
        this.strings = 6;
    }

    Guitar(String name, String type, double price, int strings) {
        super(name, type, price);
        System.out.println("Guitar Parameterized Constructor Called");
        this.strings = strings;
    }

    int getStrings() {
		return strings;
	}

	void setStrings(int strings) {
		this.strings = strings;
	}

	void play() {
        System.out.println("Strumming the guitar with " + this.strings + " strings.");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Strings: " + this.strings);
    }
}//guitar ends here

class Piano extends MusicalInstrument {
    int keys;

    Piano() {
        super();
        System.out.println("Piano Default Constructor Called");
        this.keys = 88;
    }

    Piano(String name, String type, double price, int keys) {
        super(name, type, price);
        System.out.println("Piano Parameterized Constructor Called");
        this.keys = keys;
    }
    
    int getKeys() {
		return keys;
	}

	void setKeys(int keys) {
		this.keys = keys;
	}
	
    void play() {
        System.out.println("Playing piano with " + this.keys + " keys melodiously.");
        System.out.println();
    }

	void display() {
        super.display();
        System.out.println("Keys: " + this.keys);
    }
}//piano ends here

class Drum extends MusicalInstrument {
    int pieces;

    Drum() {
        super();
        System.out.println("Drum Default Constructor Called");
        this.pieces = 5;
    }

    Drum(String name, String type, double price, int pieces) {
        super(name, type, price);
        System.out.println("Drum Parameterized Constructor Called");
        this.pieces = pieces;
    }
    
    int getPieces() {
		return pieces;
	}

	void setPieces(int pieces) {
		this.pieces = pieces;
	}
	
    void play() {
        System.out.println("Beating drums with " + this.pieces + " pieces.");
        System.out.println();
    }

	void display() {
        super.display();
        System.out.println("Drum Pieces: " + this.pieces);
        
    }
}//drum ends here

class MusicalInstrumentMain {
    public static void main(String[] args) {
        MusicalInstrument[] mi = new MusicalInstrument[3];

        mi[0] = new Guitar("Acoustic Guitar", "String", 8000, 6);
        mi[1] = new Piano("Yamaha Grand", "Keyboard", 250000, 88);
        mi[2] = new Drum("Tama Set", "Percussion", 50000, 5);

        for (int i=0; i<mi.length; i++) {
            mi[i].display();
            mi[i].play();
        }

        System.out.println("\nTotal Instruments: " + MusicalInstrument.getInstrumentCount());
    }//main ends here
}//musicalinstrumentmain ends here
