package com.paras.defaultMethods;

public interface X {
    default void m1()
    {
        System.out.println("M1 inside X");
    }
}
