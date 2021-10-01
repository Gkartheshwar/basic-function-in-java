package Functions.java;

import java.util.Scanner;

public class Sumof_Twonum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        sum(sc.nextInt(), sc.nextInt());
    }
    static void sum(int a,int b){
        int ans=a+b;
        System.out.println("the sum of num ="+ans);
    }
}
