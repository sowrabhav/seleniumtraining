package org.javapractice;

public class ParentClass extends GrandParentClass{
    public int var1;
    private int var2;
    private String str1;

    ParentClass(){

    }

    ParentClass(int val1, int val2){
        this.var1 = val1;
        this.var2 = val2;
    }

    public int Sum(int val1, int val2){
        return val1+val2;
    }

    // getters and setters

}
