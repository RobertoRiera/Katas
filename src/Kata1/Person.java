package Kata1;


public class Person {
    private String name;
    private int age;
    private String dni;

    public Person(String name, int age, String dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDni() {
        return dni;
    }

}