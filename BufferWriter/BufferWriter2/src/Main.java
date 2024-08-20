import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("BufferWriter2");
        BufferedWriter bw=new BufferedWriter(fw);

        try{
            bw.write("Ganesh Madatha");
            bw.newLine();
            String name="Madatha Ganesh";
            bw.write(name,8,6);
            bw.flush();
            bw.close();
            System.out.println("File created successfully");
        }
        catch (Exception ex){
            System.out.println("Exception is : "+ex);
        }

    }
}