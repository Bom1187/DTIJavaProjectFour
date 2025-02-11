package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new Hi();

        Hi ob2 = new Hi(50);

        //การใช้งาน object/instance คือ การใช้งาน data and method
        // การใฃ้งาน data คือ การกำหนกค่าให้หใม่หรือเอามาใช้

        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);

        ob1.showA();
        ob2.showA();
        ob2.show();

    }
}
