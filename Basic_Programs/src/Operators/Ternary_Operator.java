package Operators;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight of truck :");
        int weight= sc.nextInt();
        String res=weight>50?"Not allowed to go":"Go through road";
        System.out.println(res);
    }
}
