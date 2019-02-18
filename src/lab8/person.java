package lab8;

public class person {

    //class properties
    private String  pID;
    private  String name;
    private  String yearBorn;

    //constructor


    public person(String pID, String name, String yearBorn) {
        this.pID = pID;
        this.name = name;
        this.yearBorn = yearBorn;
    }

    public person(String pID, String name) {
        this.pID = pID;
        this.name = name;

    }



    public  void introduce(){
        System.out.println("My name is" +this.name+",");
        System.out.println("I was born"+this.yearBorn+",");

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

    public String getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(String yearBorn) {
        this.yearBorn = yearBorn;
    }
}//class
