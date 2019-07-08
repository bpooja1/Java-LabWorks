package com.age;

public class Teest
{
    public static void main(String[] args) {

        try {
            Age s = new Age(7);
            s.display();
        }catch(AgeException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Exception handled::"+e);
        }
    }
}

