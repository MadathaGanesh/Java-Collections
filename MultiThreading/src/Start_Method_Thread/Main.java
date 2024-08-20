package Start_Method_Thread;

// Multithreading can be achieved in two ways . i.e: Extending Thread class and Implementing the Runnable Interface
// Thread range is from 1 to 10
// The Default Range of Multithreading is 5
//Minimum r=priority set to 1
// Maximum priority set to 10


import java.util.Scanner;

public class Main extends Thread {      // By extending Thread Class

    public void run(){  // Creating a run method
        System.out.println("Executing Thread ........... " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value :");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            Main obj=new Main();
            obj.start();
        }
    }
}
