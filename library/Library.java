
package com.library;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Library
{
    int codeno,ch,rollno,edino,phoneno;
    String sname,bname,sadd,aname;
    Scanner sc=new Scanner(System.in);
    public void Student_info()
    {
        System.out.println("Enter sname,sadd,rollno,phoneno");
        sname=sc.next();
        sadd=sc.next();
        rollno=sc.nextInt();
        phoneno=sc.nextInt();
        System.out.println("sname is"+aname);
        System.out.println("sadd is"+sadd);
        System.out.println("rollno is"+rollno);
        System.out.println("phoneis"+phoneno);
    }
    public void Material_info()
    {
        System.out.println("Enter bname,aname,codeno,edino");
        bname=sc.next();
        aname=sc.next();
        codeno=sc.nextInt();
        edino=sc.nextInt();
        System.out.println("bname is"+bname);
        System.out.println("aname is"+aname);
        System.out.println("codeno is"+codeno);
        System.out.println("edino"+edino);
    }
    public void Show(){
    System.out.println("sname is"+aname);
    System.out.println("sadd is"+sadd);
    System.out.println("rollno is"+rollno);
    System.out.println("phoneis"+phoneno);
    System.out.println("bname is"+bname);
    System.out.println("aname is"+aname);
    System.out.println("codeno is"+codeno);
    System.out.println("edino"+edino);
    }
    public void Writer(){

    }
    public void Menu()
    {
        System.out.println("1.Student_info 2.Material_info 3.Writer 4.Show 5.exit");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                Student_info();
                break;
            case 2:
                 Material_info();
                break;
            case 3:
                Writer();
                break;
            case 4:
                Show();
                break;
            case 5:
                break;
        }
    }

}