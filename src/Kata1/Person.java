package Kata1;


public class Person {
    private final String name;
    private final int age;
    private final String dni;

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