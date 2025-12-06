package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [RollNo = " +rollno + ", Name = " +name +"\n]";
	}
	
}
public class FileHandling {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("mydata.txt");
			DataInputStream dis = new DataInputStream(fis);
			try {
				ObjectInputStream ois = new ObjectInputStream(dis);
				Student s1;
				try {
					s1 = (Student)ois.readObject();
					System.out.println(s1);
					System.out.println("Data Read Successfully!!");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main1(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("mydata.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos;
			try {
				oos = new ObjectOutputStream(dos);
				oos.writeObject(new Student(101,"Yashraj"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Written Successfully!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
