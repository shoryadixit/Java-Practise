package Inheritance.Main;

import Inheritance.Base.Person;
import Inheritance.Derived.Student;

public class Mymain {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.getName();
        obj.display();

        Person obj1 = new Person("Shorya", "shau");
        obj1.display();
    }
}