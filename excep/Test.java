package com.excep;

public class Test
{
    public static void main(String[] args) {

            try {
                Student s = new Student(12, 5);
                s.display();
            }catch(SemesterException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Exception handled::"+e);
            }

    }
}
