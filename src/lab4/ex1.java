package lab4;

import java.util.concurrent.Callable;

public class ex1 {

    public static void B(int a, int b ) {

        System.out.println("Hello B");


    }//B


    public static void main(String[] args) {
        System.out.println("Hello Main");
//        for (int i=0;i<10;i++){
//         A();
//       }

        B(5,5);

        //int sum = c(10, 10);
           System.out.println(c(10, 10));


   }//main


      public static void A (){
        System .out.println("Hello A");
    }//A

     public static int c(int a, int b) {

     System.out.println("Hello C");
     int c = a + b ;
         return c;
     }



 }//class
