package lab6;

public class ex2 {
    public static void main(String[] args) {
        //compare//เปรียบเทียบ
        String m = "Hello";
        String n = "hello";
        //=
        if (m==n)
            System.out.println(true);
        else
            System.out.println(false);

        //equal
        if (m.equals(n))
            System.out.println(true);
        else
            System.out.println(false);

        //compareTO
        if (m.compareTo(n)==0)
            System.out.println(true);
        else if (m.compareTo(n)>0)
            System.out.println(false);
        else
            System.out.println("m less than n");
    }
}
