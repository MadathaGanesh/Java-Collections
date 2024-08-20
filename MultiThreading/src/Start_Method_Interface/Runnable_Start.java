package Start_Method_Interface;

public class Runnable_Start implements Runnable{
    public void run(){
        try{
            System.out.println("Executing thread is : "+Thread.currentThread().getName());
        }
        catch (Exception ex){
            System.out.println("Exception occured is :"+ex);
        }
    }
}
