package org.codetemplates;

public class WrapperClasses {

    public static void main(String[] args) {

        // Wrapper classes are used to convert primitive data types into objects
        // Wrapper classes are used to convert primitive data types into objects so that they can be used in collections and other classes that require objects instead of primitive data types

        // Primitive data types are not objects
        // Primitive data types do not have methods
        // Primitive data types do not have methods and cannot be used in collections

        // Wrapper classes are used to convert primitive data types into objects
        // Wrapper classes are used to convert primitive data types into objects so that they can be used in collections and other classes that require objects instead of primitive data types

        // Wrapper classes are Byte, Short, Integer, Long, Float, Double, Character, Boolean

        // Byte
        // Byte is a wrapper class for the primitive data type byte

/*
        // Byte example
        Byte b = new Byte((byte) 10);
        System.out.println(b);

        // Short
        // Short is a wrapper class for the primitive data type short

        // Short example
        Short s = new Short((short) 20);
        System.out.println(s);

        // Integer
        // Integer is a wrapper class for the primitive data type int

        // Integer example
        Integer i = new Integer(30);
        System.out.println(i);

        // Long
        // Long is a wrapper class for the primitive data type long

        // Long example
        Long l = new Long(40);
        System.out.println(l);

        // Float
        // Float is a wrapper class for the primitive data type float

        // Float example
        Float f = new Float(50);
        System.out.println(f);

        // Double
        // Double is a wrapper class for the primitive data type double

        // Double example
        Double d = new Double(60);
        System.out.println(d);

        // Character
        // Character is a wrapper class for the primitive data type char

        // Character example
        Character c = new Character('a');
        System.out.println(c);

        // Boolean
        // Boolean is a wrapper class for the primitive data type boolean

        // Boolean example
        Boolean bool = new Boolean(true);
        System.out.println(bool);

*/


        // new way of creating wrapper classes
        // Byte example
        Byte bb = Byte.valueOf((byte) 10);
        System.out.println(bb);

// Short example
        Short ss = Short.valueOf((short) 20);
        System.out.println(ss);

// Integer example
        Integer ii = Integer.valueOf(30);
        System.out.println(ii);

// Long example
        Long ll = Long.valueOf(40);
        System.out.println(ll);

// Float example
        Float ff = Float.valueOf(50.0f);
        System.out.println(ff);

// Double example
        Double dd = Double.valueOf(60.0);
        System.out.println(dd);

// Character example
        Character cc = Character.valueOf('a');
        System.out.println(cc);

// Boolean example
        Boolean booll = Boolean.valueOf(true);
        System.out.println(booll);
    }

}
