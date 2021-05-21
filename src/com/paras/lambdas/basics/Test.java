package com.paras.lambdas.basics;

public class Test {

    public static void main(String[] args) {
        A a=()->{
            System.out.println("Inside MY METHOD");
        };
        a.myMethod();
    }
}
