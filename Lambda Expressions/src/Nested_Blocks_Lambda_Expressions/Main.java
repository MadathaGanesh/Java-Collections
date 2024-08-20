package Nested_Blocks_Lambda_Expressions;

import java.util.Scanner;

public class Main implements InterfaceName{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int n= sc.nextInt();
        InterfaceName leapyear=(year)->{
            if ((year%400==0)||(year%4==0)&&(year%100!=0))
                return true;
            else
                return false;
        };

        if (leapyear.test(n)){
            System.out.println(n + " is a leap year ");
        }else {
            System.out.println(n + " is not a leap year");
        }
    }

    @Override
    public boolean test(int n) {
        return false;
    }
}
