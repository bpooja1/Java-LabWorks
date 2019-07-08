package com.excep;

public class Student {
    int roll;
    int sem;

    public Student(int roll, int sem) throws SemesterException {
        if (sem < 1 || sem > 8) {
            throw new SemesterException("Invalid semester");
        } else {
            this.roll = roll;
            this.sem = sem;
        }
    }
    public void display() {
        System.out.println("roll is::" + roll);
        System.out.println("sem is::" + sem);
    }
}
