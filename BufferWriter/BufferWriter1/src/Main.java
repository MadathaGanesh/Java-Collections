import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

//write() is used to write content into the file
// FileWriter is used to create a new file
// newLine() : It will print data in new line
// flush() :: It used to push data from file to outside display to show them .
// close() : used to close the file

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter filewrite = new FileWriter("BufferWriter1.txt");  // Creating a new text file
            BufferedWriter bufferwriter = new BufferedWriter(filewrite);   // Creating a bufferwriter
            bufferwriter.write(10);
            bufferwriter.write("Name is : Ganesh");
            bufferwriter.newLine();
            bufferwriter.write("I am from Warangal");
            bufferwriter.newLine();
            String details=" I am a Marvel Fan";
            bufferwriter.write(details,8,6);

            System.out.println("File created successfully and data stored successfully");
            bufferwriter.flush();
            bufferwriter.close();

        }catch (FileAlreadyExistsException ex1){
            System.out.println("File alreay existed exception");
        }
        catch (Exception ex){
            System.out.println("Exception occured is : "+ex);
        }
    }
}