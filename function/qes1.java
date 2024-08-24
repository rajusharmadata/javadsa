// write a java method to computre the average of three number

import java.util.*;
public class qes1 {

public static void avrgofThreeNUmb(int a,int b,int c){
    int average  = (a+b+c)/3;
    System.out.println("average of Three NUmber: " + average );
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Enter Third number");
        int c = sc.nextInt();
        avrgofThreeNUmb(a, b, c);
    }
}