package collection.listinterface;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

    public static void main(String[] args) {
        //POJO plain old java objects class
        ArrayList<Employee> emp = new ArrayList<>();
        Employee empp = new Employee();
        empp.setEmpFullname("Ram");
        empp.setEmpaddress("6011 villagr drive");
        empp.setEmpID(1122);
        empp.setEmpDepartment("Accountant");

        Employee newemp = new Employee(1133,"Shyam","407 churh st","HR");

        emp.add(empp);
        emp.add(newemp);

        System.out.println(emp);

        Iterator<Employee> iterator = emp.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
