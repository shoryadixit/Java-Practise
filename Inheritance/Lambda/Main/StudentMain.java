package Inheritance.Lambda.Main;

import Inheritance.Derived.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            arr[i].setName(sc.nextLine());
            arr[i].setRollNo(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("Student Array");
        System.out.println(Arrays.toString(arr));
        //a lambda expression
        Comparator rollno = (o1, o2) -> {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            return s1.getRollNo() - s2.getRollNo();
        };

        Arrays.sort(arr, rollno);
        System.out.println("Student sorted array");
        System.out.println(Arrays.toString(arr));
    }
}