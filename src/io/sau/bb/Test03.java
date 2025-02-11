package io.sau.bb;

import net.dti.aa.Test01;

import java.lang.annotation.Inherited;

public class Test03 {
    public void met3(){
        Test01 ob3 = new Test01();

        System.out.println(ob3.a);
        //System.out.println(ob3.b); error
        //System.out.println(ob3.c); error
        //System.out.println(ob3.d); error
    }
}
