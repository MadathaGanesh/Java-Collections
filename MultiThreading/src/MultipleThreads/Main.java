package MultipleThreads;

public class Main {
    public static void main(String[] args) {
    add addition=new add();
    addcount t1=new addcount(addition);
    t1.setName("Thread 1");
    addcount t2=new addcount(addition);
    t2.setName("Thread 2");
    t1.start();
    t2.start();
    }

}
class add {
    public void docountdown() {
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color=MultipleThreads.ThreadColor.white;
                break;
            case "Thread 2":
                color=MultipleThreads.ThreadColor.blue;
                break;
            case "Thread 3":
                color=MultipleThreads.ThreadColor.black;
                break;
            default:
                color=MultipleThreads.ThreadColor.yellow;
        }
        int n=0;
        for (int i=0;i<n;i++){
            n=n+1;
            System.out.println(color + Thread.currentThread().getName() + " : n =" +n);
        }
    }
}

class  addcount extends Thread{
    private add threadcountdown;

    public addcount(add threadcountdown) {
        this.threadcountdown=threadcountdown;
    }
    
    public void run() {
        threadcountdown.docountdown();
    }
}


