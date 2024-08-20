package Arithmetic_Operation_with_Bitwise_Opeartors;

import java.util.Scanner;

public class Addition_Bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second Number : ");
        int num2=sc.nextInt();

        while (num2!=0){
            // It will convert into binary numbers  as 8,4,2,1 { ....2^4,2^3,2^2,2^1,2^0}
            // Performing AND operation and storing the carry number
            int carry=num1&num2;

            // Performing Ex-OR operation
            /*
            1^1=0
            0^0=0
            1^0=1
            0^1=1
             */

            num1=num1^num2;
            num2=carry<<1;
        }
        System.out.println("Addition of num1  and  num2  is : "+num1);
    }
}
