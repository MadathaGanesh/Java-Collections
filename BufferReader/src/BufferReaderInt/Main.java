package BufferReaderInt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("C:\\Users\\Ganes\\OneDrive\\Desktop\\Java Collections\\BufferReader\\src\\BufferReaderInt\\IntFile.txt");
        BufferedReader br=new BufferedReader(fileReader);

        try {
            String[] intstr = br.readLine().split(" ");    // Using regex pattern and  storing the values in a string array
            int a[] = new int[intstr.length];  // Creating a integer array to store the integer values of string size
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(intstr[i]);
                System.out.println("Integer array is : " + a[i]);
            }
            System.out.println("\n Adding first number and last number from the array ...");
            int sum=a[0]+a[a.length-1];
            System.out.println("sum is : "+sum);

            System.out.println("\n Adding second number and fifth number from the array .......");  // a[1]+a[4]
            int twosum=a[1]+a[4];
            System.out.println("two sum is : "+twosum);
        }catch (Exception ex){
            System.out.println("Exception occured is : "+ex);
        }


    }
}
