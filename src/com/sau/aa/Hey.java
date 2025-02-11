package com.sau.aa;

import java.security.PublicKey;

public class Hey {
    public int a = 10; //data ทำไม่มี static จะเรียกว่า Instance variable
    public  static  int b = 20; //data ที่มี static จะเรียกว่า class variable

    public void showHI(){ // instance method
        System.out.println("Hi...");
    }

    public static void showHey(){ // class method
        System.out.println("Hey...");
    }
    public void metA(){
        a = 11;
        b = 22;
        showHI();
        showHey();
    }
    public static void metB(){
        //a = 11; error
        b = 22;
        //showHI(); error
        showHey();
    }
}
