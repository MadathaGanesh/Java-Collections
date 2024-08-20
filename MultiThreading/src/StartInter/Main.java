package StartInter;

import java.util.Scanner;

public class Main implements Runnable {
    public void run(){
        try {
            System.out.println("Executing Thread is : " + Thread.currentThread().getName());
            System.out.println("THread priority is :" + Thread.currentThread().getPriority());
            System.out.println("Thread interrupted");
        }catch (Exception ex){
            System.out.println("Exception occured is :"+ex);
        }
    }
    public static void main(String[] args) {
        Main classobj=new Main();
        Thread threadobj=new Thread(classobj);
        threadobj.setName("Main Thread");
        threadobj.setPriority(8);
        threadobj.interrupt();
        threadobj.start();
    }
}
