package com.age;

public class Age {
    int age;

    public Age(int age) throws AgeException {
        if (age<18 ||age>18) {
            throw new AgeException("age invalid for voting");
        } else {
            this.age= age;
        }
    }
    public void display() {
        System.out.println("age is::" +age);
    }
}

