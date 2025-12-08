package org.example;

public class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // setters
    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
