package lab8;

public class police extends person {

    private String workCountry;

    public police(String pID, String name, String yearBorn, String workCountry) {
        super(pID, name, yearBorn);
        this.workCountry = workCountry;
    }

    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a police ang work in"+workCountry+".");
    }
}

