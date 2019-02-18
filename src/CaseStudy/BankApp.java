package CaseStudy;

public class BankApp {
    public static void main(String[] args) {

        //object customer
        Customer cus1 = new Customer();
        cus1.setName("Rattiya kotchasit");

        //object BankApp
        bankAccount acc = new bankAccount("11-110-110-110",500.00,cus1);

System.out.println(acc.getInfo());
    }//main
}//class
