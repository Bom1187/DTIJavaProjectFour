package ac.th.sau;

public class MyClass01 {
    //จุดเด่น OPP

    //1. Encapsulation (Information Hiding) การซ่อน data
    private int dataA;
    private String dataB;

    //ให้ใช้งาน data ผ่าน method Getter/Setter
    public int getDataA() {
        return dataA;
    }

    public String getDataB(){
        return dataB;
    }

    public void setDataA(int dataA){
        this.dataA = dataA;
    }

    public void setDataB(String dataB){
        this.dataB = dataB;
    }

    //2. Inheritance สืบทอดคลาส (มีคลาสแม่ คลาสลุก คลาสหลาน .....)
    //3. Polymorphism พฤติกรรมการทำงานเดียวกัน


}
