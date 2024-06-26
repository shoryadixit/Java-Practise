package Inheritance.Derived;

import Inheritance.Base.Person;

    public class Student extends Person{
        private int rollNo;
        private String course;
        private int year;
        private int sem;

        public Student(String name, String email, int rollNo, String course, int year, int sem) {
            super(name, email);
            this.rollNo = rollNo;
            this.course = course;
            this.year = year;
            this.sem = sem;
        }

        public Student() {
            this.rollNo = rollNo;
            this.course = course;
            this.year = year;
            this.sem = sem;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getSem() {
            return sem;
        }

        public void setSem(int sem) {
            this.sem = sem;
        }

        public void display(){
            System.out.println(rollNo);
            System.out.println(course);
            System.out.println(year);
            System.out.println(sem);
        }
    }
