package Lab10;

import java.util.List;

public class DAOApp {
    public static void main(String[] args) {
        empDAOImpl dao = empDAOImpl.getInstant();
        showAllData (dao);



        //ADD_EMP แสดงข้อมูลทั้งหมด
        Employee newEmp = new Employee(3,"รัตติยา คชสิทธิ์","ผู้ช่วยเจ้าหน้าที่",10000);
        // dao.addEmp(newEmp);
        // showAllData();

        //FIND หา
        Employee e = dao.getEmpById(2);
        System.out.println(e.toString());

        //UPDATE_แก้ไข
        e.setSalary(30000);
        dao.updateEmp(e);
        showAllData(dao);

        //ลบ
        dao.deleteEmp(2);
        showAllData(dao);

    }//main

    private static void showAllData(empDAOImpl dao) {
        List<Employee> allEmp = dao.getAllEmp();
        System.out.println("----Data in Database-----");
        for (Employee emp : allEmp) {
            System.out.println(emp.toString());
        }
        System.out.println("---------------------");

    }


}//class
