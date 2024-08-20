package BufferaReader1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// BufferReader is used to read text from text files and other external file sources
// close() : used to close the buffer reader
//ready() method is used to verify whether the bufferstram is ready or not
// read() method is used to read single character at a time
// readLine() method is used to read the total line at a time

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:\\Users\\Ganes\\OneDrive\\Desktop\\Java Collections\\BufferReader\\src\\BufferaReader1\\text.txt");
        BufferedReader bufferreader=new BufferedReader(fileReader);
        BufferedReader buffread=new BufferedReader(fileReader);

      /*  System.out.println("Reading content from files using read() method ....");
        while (bufferreader.ready()){
            System.out.print((char)bufferreader.read());
        }*/

        System.out.println(" \n Reading files from files using readline() method ...... ");
        while (buffread.ready()){
            System.out.println(buffread.readLine());
        }
        bufferreader.close();
        buffread.close();
    }
}
