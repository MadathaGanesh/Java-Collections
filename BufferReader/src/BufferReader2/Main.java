package BufferReader2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        FileReader filereader = new FileReader("C:\\Users\\Ganes\\OneDrive\\Desktop\\Java Collections\\BufferReader\\src\\BufferReader2\\intergerfile.txt");
        BufferedReader bufferreader = new BufferedReader(filereader);
        String line;
        while (( line=bufferreader.readLine()) != null) {
            try {
                int intvalues = Integer.parseInt(line);
                System.out.println("Integer Value is : " + intvalues);
            }catch (NumberFormatException ex1){
                System.out.println("Number format exception occured : "+ex1);
            }
            catch (Exception ex) {
                System.out.println("Exception occured is : " + ex);
            }
        }

    }
}
