package Functions.java;

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean ans=isprime(sc.nextInt());
        System.out.println(ans);
    }
    static boolean isprime(int num){
        if(num<=1){
            return false;
        }int c=2;
        if(c*c<num){
            if (num%c==0){
                return false;
            }
            c++;
            if(c*c>num){
                return true;
            }
        }return false;
    }
}
