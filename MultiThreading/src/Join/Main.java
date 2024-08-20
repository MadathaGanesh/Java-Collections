package Join;

public class Main extends Thread{
    public void run(){
        try{
            for (int i=0;i<3;i++){
                System.out.println("value is :"+i);
                Thread.sleep(100);
            }
        }catch (Exception ex){
            System.out.println("Exception is : "+ex);
        }
    }

    public static void main(String[] args) {
        Main mainobj1=new Main();
        Main mainobj2=new Main();
        Main mainobj3=new Main();
        mainobj1.start();
        try{
            mainobj1.join(200);
        }catch (Exception ex){
            System.out.println("Exception is :"+ex);
        }
        mainobj2.start();
        mainobj3.start();


    }


}
