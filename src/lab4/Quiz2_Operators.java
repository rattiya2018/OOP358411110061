package lab4;

import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        int w,h;
        Scanner sc = new Scanner(System.in);
        System.out.print("จำนวนที่1 : ");
        w = sc.nextInt();
        System.out.print("จำนวนที่2 : ");
        h = sc.nextInt();
//call
        int x = summation (w,h);
        System.out.println("ผลบวก"+x);
        int r = sub (w,h);
        System.out.println("ผลลบ"+r);
        int o = mult (w,h);
        System.out.println("ผลคูณ"+o);
        int m = divt (w,h);
        System.out.println("ผลหาร"+m);


    }//main

    private static int divt(int w, int h) {
        return w/h ;
    }

    private static int mult(int w, int h) {
        return w*h ;
    }

    private static int sub(int w, int h) {
        return w-h;
    }

    private static int summation(int w, int h) {
        return w+h;


    }//maim


}//class
