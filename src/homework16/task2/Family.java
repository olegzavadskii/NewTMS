package homework16.task2;

import java.util.List;

public class Family {
    private String sname;
    private String address;
    private int salary;
    private List<Child> children;

    public Family(String sname, String address, int salary, List<Child> children) {
        this.sname = sname;
        this.address = address;
        this.salary = salary;
        this.children = children;
    }

    public String getSname() {
        return sname;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public List<Child> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "sname='" + sname + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", children=" + children +
                '}';
    }
}
