package com.paras.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("PARAS");
        l1.add("DHIMAN");
        l1.add("BARARA");



        System.out.println(l1);
        List<String> l2 = l1.stream().map(s1 -> s1.toLowerCase()).collect(Collectors.toList());
        System.out.println(l2);
    }
}
