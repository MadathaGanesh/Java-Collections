package Start_Method_Interface;

import java.util.Scanner;

// By Implementing the Runnable Interface

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            Runnable_Start classobj=new Runnable_Start();
            Thread threadobj=new Thread(classobj);
            threadobj.start();
        }
    }
}
