package com.paras.predicates;

import java.util.function.Predicate;

public class StringCheckPredicate {

    public static void main(String[] args) {
        Predicate<String> p=s->(s.length()>5);
        System.out.println(p.test("paras"));
        System.out.println(p.test("dhiman"));
    }
}
