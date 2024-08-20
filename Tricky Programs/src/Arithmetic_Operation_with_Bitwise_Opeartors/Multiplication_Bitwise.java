package Arithmetic_Operation_with_Bitwise_Opeartors;

import java.util.Scanner;

public class Multiplication_Bitwise {
    public static void main(String[] args) {

        System.out.println("Using Bitwse Operators performing multiplication ...........");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        // Using Left shift operator we can multiply with (2,4,8,16,32,64.....   i.e; 2 power values  )
        // 2 power 1 = 2
        int mul_by_2=num<<1;   // If we do one left shift operator then it will multiply by 2
        System.out.println("Multiply by 2 : using left shift 1 :: "+mul_by_2);


        System.out.println("Enter a number : ");
        int num2=sc.nextInt();
        // 2 power 2 = 4  . so the number will multiply with 4
        int mul_by_4=num2<<2;  // If we do two left shift operator then it will multiply by 4
        System.out.println("Multiply by 4 :  Using Left Shift 2 :: "+mul_by_4);

        System.out.println("Enter a number : ");
        // 2 power 5 =32 . so the number will multiply with 32
        int num3=sc.nextInt();
        int mul_by_32=num3<<5;
        System.out.println("Multiply with 32 . Using Left Shift 5 :: "+mul_by_32);



        // Using Right Shift Operator we can divide by ( 2, 4, 8,16,32,64 .....  i.e; 2 power values )

        System.out.println(" Using Bitwise operators performing Divsion ....... ");


        System.out.println("Enter a number to divide with 2 : ");
        int num4= sc.nextInt();
       // 2 power 1 = 2  . so that it will divide by 2 .
        int divide_by_2=num4>>1;  // If we do one right shift means then number will divide by 2 .
        System.out.println("Number divide by 2 : "+ divide_by_2);


        System.out.println("Enter a number to divide with 8 : ");
        int num5= sc.nextInt();
        //  2 power 3 = 8 . so that it will divide by 8 .
        int divide_by_8=num5>>3;   // If we do three right shift means then number will divide by 2 .
        System.out.println("Number divide by 8 : "+ divide_by_8);


        System.out.println("Enter a number to divide with 8 : ");
        int num6= sc.nextInt();
        //  2 power 4 = 16 . so that it will divide by 16 .
        int divide_by_16=num6>>4;   // If we do three right shift means then number will divide by 2 .
        System.out.println("Number divide by 16 : "+ divide_by_16);



    }
}
