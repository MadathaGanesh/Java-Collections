package SetPriority;

import java.util.Scanner;

public class Main implements Runnable {
    public void run(){
        //System.out.println("Thread Name is : "+Thread.currentThread().getName());
        //System.out.println("Thread isAlive() method :"+Thread.currentThread().isAlive());
        System.out.println("Thread prioity is : "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value :");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            Main mainobj = new Main();
            Thread threadobj = new Thread(mainobj);
            Thread threadobj2=new Thread(mainobj);
            Thread threadobj3=new Thread(mainobj);
            Thread threadobj4=new Thread(mainobj);
            threadobj4.setPriority(Thread.NORM_PRIORITY);
            threadobj3.setPriority(8);
            threadobj.setPriority(Thread.MAX_PRIORITY);
            threadobj2.setPriority(Thread.MIN_PRIORITY);
            threadobj.start();
            threadobj2.start();
            threadobj3.start();
            threadobj4.start();
        }
    }
}
