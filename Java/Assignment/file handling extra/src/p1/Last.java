package p1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Last extends Thread{
	public void run() {
		try {
			BufferedReader b1 = new BufferedReader(new FileReader("E:\\Java\\Assignment\\file handling extra\\src\\last.txt"));
			
			String str = null;
			try {
				while((str = b1.readLine())!= null) {
					System.out.println(str);
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
