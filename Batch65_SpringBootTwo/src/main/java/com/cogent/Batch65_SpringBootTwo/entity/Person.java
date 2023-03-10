package com.cogent.Batch65_SpringBootTwo.entity;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return Objects.equals(name, other.name) &&
               age == other.age;
    }
}