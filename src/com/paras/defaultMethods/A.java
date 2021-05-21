package com.paras.defaultMethods;

public interface A {

    default void m1()
    {
        System.out.println("M1 inside A");
    }
}
