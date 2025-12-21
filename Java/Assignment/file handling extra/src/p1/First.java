package p1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class First extends Thread{
	public void run() {
		try {
			BufferedReader b1 = new BufferedReader(new FileReader("E:\\Java\\Assignment\\file handling extra\\src\\first.txt"));
			
			String line = null;
			try {
				
				while((line = b1.readLine())!= null){
					System.out.println(line);
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
