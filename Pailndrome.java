package Functions.java;

import java.util.Scanner;

public class Pailndrome {
    public static void main(String[] args) {
            num();
    }
    static void num(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int value=num;
        int count;
        int ans=0;
        while (value>0){
            count=value%10;
            ans=ans*10+count;
            value/=10;
        }
        if (ans==num){
            System.out.println("the num is palindrome");
        }else{
            System.out.println("the num is not palindrome");
        }
    }

}


