package com.paras.lambdas.basics;

public class TestSum {

    public static void main(String[] args) {

        Sum sum=(a,b)->System.out.println(a+b);
        sum.sum(5,10);
    }

}
