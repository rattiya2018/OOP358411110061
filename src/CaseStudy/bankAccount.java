package CaseStudy;

public class bankAccount {
    private  String id;
    private  double balance;
    private  Customer cus;

    public bankAccount(String id, double balance, Customer cus) {
        this.id = id;
        this.balance = balance;
        this.cus = cus;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return this.balance;
    }
    public  void doposit (double amount){
        this.balance += amount;//this.balance = this.balance += amount;
    }
    public  void withdraw (double amount){
        this.balance -= amount;//
    }

    public String getInfo() {
        return "[Customer Name : " +this.cus.getName()+ " " +
                "Bank ID"+this.id+""+
                "Balance:"+this.balance+"]";
    }
}
