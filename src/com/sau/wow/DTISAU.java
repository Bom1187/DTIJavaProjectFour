package com.sau.wow;

public class DTISAU {
    //data member ข้อมูล
    String name;
    int birthYear, age;
    double high = 100;
    //method member การทำงาน
    public void showHI(){
        System.out.println("Hi...." + name);
    }
    public  void calAndShowAge(){
        age = 2568 - birthYear;
        System.out.println("Your age : " + birthYear);
    }
}
