package lab8;

public class GraphicObjectApp {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10.0,5.0);

        rec.setColor("สีแดง");
        rec.draw();
        System.out.println( rec.findArea());
        System.out.println( rec.getColor());
        System.out.println( rec.getWidth());
        System.out.println( rec.getHigh());

        Circle cir = new Circle(20.0);
        cir.setColor("Blua");
        System.out.println( "The area of my circle is : " +cir.findArea());
    }


}
