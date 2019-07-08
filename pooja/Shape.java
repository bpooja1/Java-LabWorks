package com.pooja;

public class Shape
{
    private int a;
    private int b;
    private int x;
    private int y;
    public Shape(int a,int b,int x,int y){
        this.a=a;
        this.b=b;
        this.x=x;
        this.y=y;
    }
    public Shape(int a,int b){
        this(a,b,0,0);
    }
    public Shape(){
        this(0,0,0,0);
    }
    public void show()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
