package lab2;

public class ex3 {
    public static void main(String[] args) {
       //if-else-if
       //simple Grade Calculator
        //F=0-49, D=50-59, C=60-69, B= 70-79, A=80-100
       int scoer = 110;
       if(scoer>=0&&scoer<=49)
           System.out.println("Grade F.");
       else if (scoer>=50&&scoer<=59)
           System.out.println("Grade D.");
       else if (scoer>=60&&scoer<=69)
           System.out.println("Grade C.");
       else if (scoer>=70&&scoer<=79)
           System.out.println("Grade B.");
       else if (scoer>=80&&scoer<=100)
           System.out.println("Grade A.");
       else
           System.out.println("Invalid Score.");
    }
}//main
