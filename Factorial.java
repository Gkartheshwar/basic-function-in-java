package Functions.java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       fact();
    }
    static void fact() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int a = 1, b = 2, c=0;
        while (count < num) {
            c = a * b;
            a = c;
            b += 1;
            count++;
        }
        System.out.println(c);
    }
}
