package Primitive_Datatypes;

import java.util.Scanner;

public class Printing_Characters {
    public static void main(String[] args) {
        // Printing Characters
        char ch1='A';
        char ch2='9';
        char unichar='\u012f';
        System.out.println("Ch1 :"+ch1);
        System.out.println("Ch2 :"+ch2 );
        System.out.println("Unichar : "+unichar);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character :");
        char ch=(char) sc.nextByte();
        System.out.println("Char : "+ch);



    }
}
