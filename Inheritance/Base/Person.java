package Inheritance.Base;

public class Person {
    private String name;
    private String email;
    //No argument Constructor

    public Person(){
        System.out.println("Parent no-args constructor called.");
        name = null;
        email = null;
    }

    //Parameterized Constructor
    public Person(String name, String email){
        System.out.println("Parent parameterized contructoe called.");
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(name);
        System.out.println(email);
    }
}
