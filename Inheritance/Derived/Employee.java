package Inheritance.Derived;

import Inheritance.Base.Person;

public class Employee extends Person {
    private int empID;
    private int salary;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display(){
        super.display();
        System.out.println(empID);
        System.out.println(salary);
    }
}
