package org.javapractice;

public class You extends ParentClass{

    private int i;
    private int i2;

    public int getI(){
        return this.i;
    }

    public static void main(String[] args) {
        You you = new You();
        you.testMethod();
    }

    public void testMethod(){
        Sum(10, 20);
        sub(20, 10);
    }
}
