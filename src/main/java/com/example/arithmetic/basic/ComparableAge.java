package com.example.arithmetic.basic;

public class ComparableAge implements Comparable{
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ComparableAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Object o) {
        return this.age- ((ComparableAge)o).age;
    }
}
