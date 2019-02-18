package lab8;

public class Honda implements Car {
    //properties
    private String id;
    private String color;

    //Constructor
    public Honda(String id, String color) {
        this.id = id;
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        return "Honda{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void turnRiht(double x) {

    }

    @Override
    public void turnLeft(double x) {

    }

    @Override
    public void stop() {

    }
    //
}//Class
