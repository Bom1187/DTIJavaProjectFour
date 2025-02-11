package com.sau.aa;

public class Hello {
    // data member
    public int a;
    public int b = 10;

    // method member
    public void showA(){
        System.out.println(a);

    }
    public void showB(){
        System.out.println(b);
    }
    public void showSumAB(){
        System.out.println(a+b);
    }

    //constructor
    public Hello(int a){
        this.a = a;
        System.out.println("Hello....");
    }
    public Hello(String w){
        System.out.println("Hey...." + w);
    }
    public Hello(){
        System.out.println("Hi....");
    }
}






