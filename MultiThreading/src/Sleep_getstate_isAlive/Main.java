package Sleep_getstate_isAlive;

import java.util.Scanner;

public class Main extends Thread{
    public void run(){
        System.out.println("Thread executing is : "+Thread.currentThread().getName());
        System.out.println("Thread priority is : "+Thread.currentThread().getPriority());
        System.out.println("Thread state is :"+Thread.currentThread().getState());
        System.out.println("Isinterrupted() methos is :"+Thread.currentThread().isInterrupted());
        System.out.println("Activecount() method :"+Thread.activeCount());
        System.out.println("Thread isAlive() method : "+Thread.currentThread().isAlive() +"\n");

    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++) {
            Main obj = new Main();
            obj.start();
            Thread.sleep(800);

        }

    }
}
