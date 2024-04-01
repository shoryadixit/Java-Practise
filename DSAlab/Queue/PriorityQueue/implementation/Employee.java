package DSAlab.Queue.PriorityQueue.implementation;

public class Employee implements Comparable<Employee> {
    private int empID;
    private String name;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo( Employee o) {
        return 0;
    }
}
