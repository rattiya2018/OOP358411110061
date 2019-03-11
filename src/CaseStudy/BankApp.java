package CaseStudy;

public class BankApp {
    public static void main(String[] args) {

        //object customer
        Customer cus1 = new Customer();
        cus1.setName("Rattiya kotchasit");

        //object BankApp
        bankAccount acc = new bankAccount("11-110-110-110",500.00,cus1); //ฝากเริ่มแรก

        System.out.println(acc.getInfo());
        acc.doposit(2000.00);//ฝากเพิ่ม
        System.out.println(acc.getInfo());
        acc.withdraw(1000.00);
        System.out.println(acc.getInfo());//ถอน
    }//main
}//class
