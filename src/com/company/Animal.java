package com.company;

public class Animal {
    private String name;
    private int age;
    private Enum Typ;

    public Animal(String name, int age, Enum typ) {
        this.name = name;
        this.age = age;
        Typ = typ;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Typ=" + Typ +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enum getTyp() {
        return Typ;
    }

    public void setTyp(Enum typ) {
        Typ = typ;
    }
}
