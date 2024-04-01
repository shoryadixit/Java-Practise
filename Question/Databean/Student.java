package Question.Databean;

public class Student implements Comparable {
    private String studentname;
    private int rollNo;

    public Student(String studentname, int rollNo) {
        this.studentname = studentname;
        this.rollNo = rollNo;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
