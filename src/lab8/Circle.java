package lab8;

public class Circle extends GraphicObject {
    private  double r;
    final double pi = 3.14;
    @Override
    void draw() {
       System.out.println();
    }

    @Override
    double findArea() {
        return pi*(r*r);
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }
}
