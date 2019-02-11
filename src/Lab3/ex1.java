package Lab3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your nickname? : ");

        name = sc.nextLine();

        System.out.println("Hello,"+name);
//age
        System.out.print("อายุเท่าไร? : ");
        int age = sc.nextInt();

        System.out.println("ฉันอายุ "+age+ " ปี ");
        if(age>30)
            System.out .println("คุณแก่");
        else
            System.out.println("คุณอายุน้อย");
    }//main
}//class
