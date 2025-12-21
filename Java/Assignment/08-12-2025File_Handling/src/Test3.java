

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			FileWriter f1 = new FileWriter("demo.txt");
			FileWriter f1 = new FileWriter("demo.txt",true);//to append data by calling single write method multiple time it will append data next to the existing
			f1.write("Good Morning!!!");
			f1.write("Hello!!!");
			f1.close();//imp to close else it will not write in file
			System.out.println("Written Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader f2 = new FileReader("demo.txt");
			int count;
			try {
				while((count = f2.read()) != -1) {
					System.out.print((char)count);
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

}
