package com.paras.methodreference;

import com.paras.lambdas.basics.MyRunnableImpl;

public class MethodRef {

    public static void method1()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Inside Child thread..");
        }
    }

    public static void main(String[] args) {

        Runnable r=MethodRef::method1;
        Thread t=new Thread(r);
        t.start();

        for (int i=0;i<10;i++)
        {
            System.out.println("Inside Main thread..");
        }

    }
}
