package Functions.java;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        odd(sc.nextInt());
    }
    static void odd(int num){
        if(num%2!=0){
            System.out.println(num+"the given num is odd");

        }else
        {
            System.out.println(num+"the given num is even ");
        }
    }
}
