package net.dti.aa;

import io.sau.bb.Test04;

public class Test01 {
    public final int a = 10; //ห้ามเปลี่ยนค่า
    private final int b = 20;
    protected final int c = 30;
    final int d = 40;

    public void met1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
