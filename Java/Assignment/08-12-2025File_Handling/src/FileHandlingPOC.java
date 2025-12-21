import java.io.*;

public class FileHandlingPOC {

    public static void main(String[] args) {

        String file1 = "sample.txt";
        String file2 = "copy.txt";
        String file3 = "bufferedCopy.txt";

           //1. FileWriter – Write data (Overwrite)
        try (FileWriter fw = new FileWriter(file1)) {
            fw.write("Java File Handling\n");
            fw.write("Using FileWriter\n");
            fw.write("Using FileReader\n");
            System.out.println("File written using FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
           //2. FileWriter – Append Mode
        try (FileWriter fw = new FileWriter(file1, true)) {
            fw.write("\nAppended Text using FileWriter");
            System.out.println("Data appended");
        } catch (IOException e) {
            e.printStackTrace();
        }

           //3. FileReader – Read character by character
        System.out.println("\nReading using FileReader:");
        try (FileReader fr = new FileReader(file1)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

           //4. BufferedWriter – Write data with buffering

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            bw.write("BufferedWriter Example");
            bw.newLine();
            bw.write("Fast writing using buffer");
            System.out.println("\n\nWritten using BufferedWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }

           // 5. BufferedReader – Read line by line
        System.out.println("\nReading using BufferedReader:");
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

          // 6. Copy File using BufferedReader & Writer
        try (BufferedReader br = new BufferedReader(new FileReader(file1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file3))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("\nFile copied using buffered streams");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
