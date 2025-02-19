package org.practice;

public class ConstructorPractice {
    public static void main(String[] args) {
        ConstructorPractice cpractice = new ConstructorPractice();

    }
    ConstructorPractice(){
        System.out.println("From Constructor block");
    InnerClass ic = new InnerClass();
        SubClass sc = new SubClass();

    }
   class InnerClass{
       {
           System.out.println("Instance block");
       }

       static{
            System.out.println("Static block");
        }

    }
    class SubClass{
        {
            System.out.println("Instance from subclass block");
        }

        static{
            System.out.println("subclass Static block");
        }


    }



}
