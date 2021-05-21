package com.paras.functions;

import java.util.function.Function;

public class FunctionsTest {
    public static void main(String[] args) {
        Function<String,Integer> f=s->s.length();
        System.out.println(f.apply("Paras"));
        System.out.println(f.apply("Dhiman"));

    }
}
