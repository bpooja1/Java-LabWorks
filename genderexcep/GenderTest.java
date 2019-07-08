package com.genderexcep;

public class GenderTest {
    public static void main(String[] args) {
        try{
            Gender g=new Gender("Female");
            g.display();
        }catch(GenderException ge){
            System.out.println("input male or female");
            System.out.println(ge.getMessage());
        }
    }
}
