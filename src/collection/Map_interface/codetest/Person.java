package collection.Map_interface.codetest;

import java.util.Date;

/*
1. Create POJO class Person
        Person - ID(Long), Name, Date(Date class), Address

     2. Create with HashMap and user Person class as value ..
       1. Add the data by calling constructor of person class
       2. Remove
       3. Clone
       4. ContainKey
       5. Loop using key/value pair
 */
public class Person implements Comparable<Person> {


    private Long PERSONID;
    private  String PERSONNAME;
    private Date DOB;
    private String address;

    public Person() {
    }

    public Person(Long PERSONID, String PERSONNAME, Date DOB, String address) {
        this.PERSONID = PERSONID;
        this.PERSONNAME = PERSONNAME;
        this.DOB = DOB;
        this.address = address;
    }

    public Long getPERSONID() {
        return PERSONID;
    }

    public void setPERSONID(Long PERSONID) {
        this.PERSONID = PERSONID;
    }

    public String getPERSONNAME() {
        return PERSONNAME;
    }

    public void setPERSONNAME(String PERSONNAME) {
        this.PERSONNAME = PERSONNAME;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PERSONID=" + PERSONID +
                ", PERSONNAME='" + PERSONNAME + '\'' +
                ", DOB=" + DOB +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
