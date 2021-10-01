package Functions.java;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the age ");
    polling(sc.nextInt());
    }
    static void polling(int age){
    if(age>=18){
        System.out.println("the person is eligebel to vote");
    }else{
        System.out.println("the person is not eligebel to vote");
    }
    }
}
