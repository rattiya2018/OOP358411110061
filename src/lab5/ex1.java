package lab5;
import java.util.Arrays;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {

        int num []=new int [5];

        showData (num);
        num[3]=5;
        showData(num);

        num[0]=num[3]*5;
        showData(num);

       int myNum[] = inputData (num);

       showData(myNum);
       //
       showDataEnchange(myNum);
       //min
       finalMin(myNum);
       //หาค่ามาค่าน้อย
      //Max
        finalMax(myNum);
        //หาค่า average
        findAverage(myNum);

        //sorting array low -high
        sortArray(myNum);

    }//main

    private static void sortArray(int[] myNum) {
        Arrays.sort(myNum);
        System.out.println("Sorting Data in array: ");
        showData(myNum);
    }


    private static void findAverage(int[] myNum) {
        double total =0;
        for (int val:myNum){
            total+=val;
        }
        System.out.println("the average Value is : "+(total/myNum.length));
    }

    private static void finalMax(int[] myNum) {
        int max = myNum[0];
        for (int i=0; i < myNum.length;i++){
            if (max<myNum[i])
                max=myNum[i];

        }
        System.out.println("The maximum integer is :"+max);
    }

    private static void finalMin(int[] myNum) {
        int min = myNum[0];
        for (int i=0; i < myNum.length;i++){
            if (min>myNum[i])
                min=myNum[i];

        }
        System.out.println("The minimum integer is :"+min);
    }

    private static void showDataEnchange(int[] myNum) {
        System.out.println("Data in array (enchange:)");
        for (int val :myNum
             ) {
            System.out.print(val+"\t");
        }
        System.out.println();
    }

    private static int[] inputData (int[] num) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter integert:");
        for (int i=0; i < num.length; i++){
            System.out.print("num["+ i + "]:");
            num[i]=sc.nextInt();
        }

       return num;

    }//inputData

    private static void showData(int[] num) {

       System.out.println("Data in Array :");
       for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+"\t");

        }
        System.out.println("\n");


    }//showData
}//class
