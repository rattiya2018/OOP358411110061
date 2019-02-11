package lab8;

public class person {

    //class properties
    private String  pID;
    private  String name;

    //constructor


    public person(String pID, String name) {
        this.pID = pID;
        this.name = name;
    }

    //toString


    @Override
    public String toString() {
        return "person{" +
                "pID='" + pID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}//class
