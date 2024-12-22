import java.io.*;

class Person implements Serializable {

    private String name;
    private int age;
    private long aadhar;

    public Person(String name, int age, long aadhar) {
        this.name = name;
        this.age = age;
        this.aadhar = aadhar;
    }

    @Override
    public String toString() {
        return (
            "[Person:- Name: " +
            name +
            ", Age: " +
            age +
            ", Aadhar: " +
            aadhar +
            " ]"
        );
    }
}

public class Serialization {
    public static void main(String[] args) {
        Person p = new Person("John Doe", 30, 1234567890);
        System.out.println("Before Serialization: " + p);
        try {
            FileOutputStream fos = new FileOutputStream("person.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
            fos.close();
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Deserializing the object...");
        try {
            FileInputStream fis = new FileInputStream("person.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p1 = (Person) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Object has been deserialized");
            System.out.println("After Deserialization: " + p1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}