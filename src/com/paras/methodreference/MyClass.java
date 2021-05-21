package com.paras.methodreference;

public class MyClass {

    public void myMethodM1(int i)
    {
        System.out.println("Value of a square"+i*i);
    }

    public static void main(String[] args) {
        //MyInterface f=(a)->System.out.println("Value of a square"+a*a);
        MyClass myClass=new MyClass();
        MyInterface m=myClass::myMethodM1;

        m.myMethod(20);
    }
}
