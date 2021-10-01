package Functions.java;

import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     python(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
    static void python(int n1,int n2,int n3){
        int a,b,c;
        a=n1*n1;
        b=n2*n2;
        c=n3*n3;
        if(a+b==c){
            System.out.println("the no is pythogerous triplet");
        }else{
            System.out.println("the num is not triplet");
        }

    }
}
