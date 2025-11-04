class Student 
{
	int rollno , marks ;
	String name ;

	void setRollno (int r){
		this.rollno = r;
	}
	void setMarks (int m){
		this.marks = m;
	}
	void setName (String str){
		this.name = str;
	}	
}//student ends here ....
class TestStudent 
{
	public static void main(String[] args){
	Student s1;

	s1 = new Student() ;

	s1.setRollno(1);
	s1.setMarks(87);
	s1.setName("Yash");

	System.out.println("Rollno is : " + s1.rollno);
	System.out.println("Marks is : " + s1.marks);
	System.out.println("Name is : " +s1.name);
	}// main ends here 
}// TestStudent ends here .....