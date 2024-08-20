package Operators;

import java.util.Scanner;

public class And_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature : ");
        double temp= sc.nextDouble();
        if (temp>=97 && temp<=120){
            System.out.println("You are suffering with fever");
        }else {
            System.out.println("Your health is good");
        }

    }
}
