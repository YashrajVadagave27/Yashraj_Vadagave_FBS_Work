class Artist {
    String name;
    String field;
    int experience;
    static int artistCount = 0;

    Artist() {
        System.out.println("Artist Default Constructor Called");
        this.name = "Unknown";
        this.field = "General";
        this.experience = 0;
        artistCount++;
    }

    Artist(String name, String field, int experience) {
        System.out.println("Artist Parameterized Constructor Called");
        this.name = name;
        this.field = field;
        this.experience = experience;
        artistCount++;
    }
    
    String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getField() {
		return field;
	}

	void setField(String field) {
		this.field = field;
	}

	int getExperience() {
		return experience;
	}

	void setExperience(int experience) {
		this.experience = experience;
	}
	
	static int getArtistCount() {
		return artistCount;
	}

	void perform() {
        System.out.println("Artist performing in their field...");
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Field: " + this.field);
        System.out.println("Experience: " + this.experience + " years");
    }
}//artist ends here

class Singer extends Artist {
    String songGenre;

    Singer() {
        super();
        System.out.println("Singer Default Constructor Called");
        this.songGenre = "Classical";
    }

    Singer(String name, String field, int experience, String genre) {
        super(name, field, experience);
        System.out.println("Singer Parameterized Constructor Called");
        this.songGenre = genre;
    }
    
    String getSongGenre() {
		return songGenre;
	}

	void setSongGenre(String songGenre) {
		this.songGenre = songGenre;
	}

	void perform() {
        System.out.println(this.name + " is singing a " + this.songGenre + " song beautifully!");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Genre: " + this.songGenre);
    }
}//singer ends here

class Painter extends Artist {
    String paintType;

    Painter() {
        super();
        System.out.println("Painter Default Constructor Called");
        this.paintType = "Oil Painting";
    }

    Painter(String name, String field, int experience, String paintType) {
        super(name, field, experience);
        System.out.println("Painter Parameterized Constructor Called");
        this.paintType = paintType;
    }
    
    String getPaintType() {
		return paintType;
	}

	void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	void perform() {
        System.out.println(this.name + " is painting using " + this.paintType + ".");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Paint Type: " + this.paintType);
    }
}//painter ends here

class Actor extends Artist {
    String movieGenre;

    Actor() {
        super();
        System.out.println("Actor Default Constructor Called");
        this.movieGenre = "Drama";
    }

    Actor(String name, String field, int experience, String movieGenre) {
        super(name, field, experience);
        System.out.println("Actor Parameterized Constructor Called");
        this.movieGenre = movieGenre;
    }
    
    String getMovieGenre() {
		return movieGenre;
	}

	void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	void perform() {
        System.out.println(this.name + " is acting in a " + this.movieGenre + " film.");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Movie Genre: " + this.movieGenre);     
    }
}//actor ends here

class ArtistMain {
    public static void main(String[] args) {
        Artist[] a = new Artist[3];

        a[0] = new Singer("Arijit Singh", "Music", 10, "Romantic");
        a[1] = new Painter("MF Hussain", "Art", 25, "Watercolor");
        a[2] = new Actor("Shah Rukh Khan", "Cinema", 30, "Drama");

        for (int i=0; i<a.length; i++) {
            a[i].display();
            a[i].perform();
        }

        System.out.println("\nTotal Artists: " + Artist.getArtistCount());
    }//main ends here
}//artistmain ends here
