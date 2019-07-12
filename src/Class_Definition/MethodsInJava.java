package Class_Definition;

import java.util.Arrays;

public class MethodsInJava {
    //global variables
    int empID;
    int empSalary;
    String empName;
    String empAddress;
    int weekHours[];

    public int setEmpID(int empID){
        this.empID = empID;
        return empID;
    }
    public int getEmpID(int empID){
        System.out.println(empID);
        return empID;
    }
    int [] getWeekHours(int [] arr){
        weekHours = arr;
        Arrays.toString(weekHours);
        //convert array to the string.
        System.out.println(Arrays.toString(weekHours));
        return weekHours;
    }


    public static void main(String[] args) {
        //calling default constructor
        MethodsInJava obj = new MethodsInJava();
        int emp1 = obj.setEmpID(11);
//        System.out.println(emp1);
//        System.out.println();
//        System.out.println();
//        obj.setEmpID(11);
//        obj.setEmpID(11);

        int hours[] = {8,9,9,9}; // initializing the array
        obj.getWeekHours(hours); //calling method getWeekhours.


    }
}
