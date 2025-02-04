package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {
        // สร้าง Object/Instance of Class
        // วิธีที่ 1 มี 2 ประเภท
        DTISAU mod;
        mod = new DTISAU();

        // วิธีที่ 2 มี 1 วิธี
        DTISAU med = new DTISAU();

        //การใช้งาน Object/Instance คือ การใช้งาน data/method
        //การใช้งาน data คือการเปลี่ยนให้มันใหม่ หรือเอาค่ามันมาใช้
        //การใช้งาน method คือให้ method ของ Object/Instance นั้นๆทำงาน

        mod.name = "เซฟ";
        System.out.println(mod.name + " สูง " + mod.high);

        med.name = "ออย";
        med.showHI();
    }
}
