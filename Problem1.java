package Functions.java;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        max();
        min();
    }
    static void max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three num");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("the maximum num of "+num1+"_"+num2+"_"+num3+"is ="+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("the maximum num of "+num1+"_"+num2+"_"+num3+"is ="+num2);
        }else{
            System.out.println("the maximum num of "+num1+"_"+num2+"_"+num3+"is ="+num3);
        }
    }static void min(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three num");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("the minimum num of"+num1+"_"+num2+"_"+num3+"is ="+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("the minimum num of"+num1+"_"+num2+"_"+num3+"is ="+num1);
        }else{
            System.out.println("the minimum num of"+num1+"_"+num2+"_"+num3+"is ="+num1);
        }
    }
}