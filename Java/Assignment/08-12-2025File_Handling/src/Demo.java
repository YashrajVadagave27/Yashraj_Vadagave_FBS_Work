import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        try (BufferedReader bf = new BufferedReader(new FileReader("E:\\Java\\Assignment\\08-12-2025File_Handling\\src\\data.txt"))) {

            String str;

            // read first line
            if ((str = bf.readLine()) != null) {
                String[] da = str.split(",");
                System.out.printf("%-15s %-15s %-15s%n", da[0], da[1], da[2]);
            }

            // read remaining lines
            while ((str = bf.readLine()) != null) {
                String[] daa = str.split(",");
                System.out.printf("%-15s %-15s %-15s%n", daa[0], daa[1], daa[2]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        
        try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Java\\Assignment\\08-12-2025File_Handling\\src\\data.txt", true));
			bw.write("104, amit, 689");
			bw.newLine();
			bw.close();
			System.out.println("Writing Successfully!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
