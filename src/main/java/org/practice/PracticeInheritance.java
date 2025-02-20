package org.practice;

class A {
    int a=100;
    void display(){
        System.out.println(a);
    }
}

class B extends A{
    int b=200;
    void show(){
        System.out.println(a+b);
    }
}

public class PracticeInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
