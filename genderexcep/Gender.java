package com.genderexcep;

public class Gender
{
    String gender;
    public Gender(String gender) throws GenderException
    {
        if(gender=="male" || gender=="female" )
        {

            throw new GenderException("Invalid gender");
        } else {
            this.gender=gender;
        }
    }
    public void display() {
        System.out.println("gen::" +gender);
    }
}

