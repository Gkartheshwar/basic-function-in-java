package Functions.java;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        ans(sc.nextInt());
    }
    static void ans(int r){
        double circumfrence=2*3.17*r;
        double area=3.17*r*r;
        System.out.println("circumfrence of circle is ="+circumfrence);
        System.out.println("area of circle is ="+area);

    }
}
