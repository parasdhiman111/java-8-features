package com.paras.methodreference.constructors;

public class MyClass {
    private String name;

    public MyClass(String name)
    {
        this.name=name;
        System.out.println("inside the constructor: "+name);
    }
}
