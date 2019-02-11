package lab7;

public class Student {

private  String id;
private  String name;
private  char gender;
//constructor มี 2 แบบ
    //1.default constructor โครงสร้างแบบ1ออกแบบอัติโนมัติ
    public  Student(){}
    //2.design constructor โครงสร้างแบบ2เราออกแบบเอง
    public  Student(String id,String name,char gender){
        this.id = id;
        this.name = name;
        this.gender =gender;
    }//กำหนดค่าของตัวแปล //this. คือ ตัวอ้างไอดีของอีกตัวหนึ่งกรณีชื่อคลาสเหมือนกัน


    //getter and setter methods

    public  String getId(){
       return this.id;
    }//getter อ่านค่าไอดี

    public void  setId (String id){
        this.id = id;
    }//setter เปลี่ยนข้อมูล


    public  String getName (){
        return  this.name;
    }

    public  void  setName (String Name){
        this.name = Name;
    }


    public char getGender (){
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



    //toString

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}//class
