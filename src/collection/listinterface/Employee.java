package collection.listinterface;

public class Employee {

    private int empID;
    private String empFullname;
    private String empaddress;
    private String empDepartment;

    public Employee() {
    }

    public Employee(int empID, String empFullname, String empaddress, String empDepartment) {
        this.empID = empID;
        this.empFullname = empFullname;
        this.empaddress = empaddress;
        this.empDepartment = empDepartment;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpFullname() {
        return empFullname;
    }

    public void setEmpFullname(String empFullname) {
        this.empFullname = empFullname;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empFullname='" + empFullname + '\'' +
                ", empaddress='" + empaddress + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }
}


