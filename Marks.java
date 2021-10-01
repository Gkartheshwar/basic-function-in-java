package Functions.java;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        grade(sc.nextInt());
    }
    static void grade(int mark){
        if(mark>=91 && mark<=100){
            System.out.println("AA");
        }else if(mark>=81 && mark<=90){
            System.out.println("Ab");
        }else if(mark>=71 && mark<=80){
            System.out.println("BB");
        }else if(mark>=61 && mark<=70){
            System.out.println("BC");
        }else if(mark>=51 && mark<=60){
            System.out.println("CD");
        }else if(mark>=41 && mark<=50){
            System.out.println("DD");
        }else if(mark<=40){
            System.out.println("fail");
        }else{
            System.out.println("enter the marks properly");
        }
    }
}