package BasicLambdaExpression1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two value :");
        int numvalue= sc.nextInt();
        int numvalue2= sc.nextInt();
        Interface1 obj=()->{
            System.out.println("sum of two Value is : "+(numvalue+numvalue2));
        };
        obj.draw();
    }
}
