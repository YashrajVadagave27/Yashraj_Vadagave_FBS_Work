class Stud {
    int frn;
    String name;
    int distance;
    static int count = 0;
    
    Stud() {
        System.out.println("Stud Default Constructor Called");
        this.frn = 101;
        this.name = "Yashraj";
        this.distance = 10;
        count++;
    } // default
    
    Stud(int fid, String sName, int dist) {
        System.out.println("Stud Para Constructor Called");
        this.frn = fid;
        this.name = sName;
        this.distance = dist;
        count++;
    } // parameterised
    
    int getFrn() {
        return frn;
    }
    void setFrn(int frn) {
        this.frn = frn;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    int getDistance() {
        return distance;
    }
    void setDistance(int distance) {
        this.distance = distance;
    }
    static int getCount() {
        return count;
    }
    static void setCount(int count) {
        Stud.count = count;
    }
    
    void display() {
        System.out.println("FRN is : " + this.frn);
        System.out.println("Name is : " + this.name);
        System.out.println("Distance is : " + this.distance);
    }

} // class Stud ends here


class placedStudent extends Stud // step 1 : apply is-a relationship using extends keyword
{
	//step 2 : remove state and behaviour available in super class means invisible attribute
    String companyName;
    String designation;
    
    placedStudent() {
        super(); //step 3 - A
        System.out.println("placedStudent Default Constructor Called");
        this.companyName = "TCS";
        this.designation = "Developer";
    } // default
    
    placedStudent(int fid, String sName, int dist, String cName, String desig) {
    	super(fid,sName,dist); //step 3 - B
        System.out.println("placedStudent Para Constructor Called");
        this.companyName = cName;
        this.designation = desig;
    } // parameterised
    

    String getCompanyName() {
        return companyName;
    }
    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    String getDesignation() {
        return designation;
    }
    void setDesignation(String designation) {
        this.designation = designation;
    }
    
    void display() {
        super.display(); // step 4 : to call super class display() method in subclass to achieve reusability 
        System.out.println("Company Name is : " + this.companyName);
        System.out.println("Designation is : " + this.designation);
        System.out.println("\n\n");
    }

} // placedStudent ends here


class Student {
    public static void main(String[] args) {
    	
    	//Stud s1 = new Stud();
    	//System.out.println("Student Count is : "+Stud.getCount());
    			
    	//Stud s2 = new Stud(102, "Yash", 15);
    	//System.out.println("Student Count is : "+Stud.getCount());
        
    	placedStudent ps1 = new placedStudent();
        ps1.display();
        
        placedStudent ps2 = new placedStudent(102, "Raj", 20, "L&T", "Web Developer");
        ps2.display();
        
        System.out.println("Total Student Count is : " + Stud.getCount());
 
    } // main ends here
} // Student ends here



