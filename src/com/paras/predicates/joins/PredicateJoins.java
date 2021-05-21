package com.paras.predicates.joins;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int arr[]={0,7,10,20,30,40,50,60,70,73};
        Predicate<Integer> p1=i->i>10;
        Predicate<Integer> p2=i-> i%2==0;
        System.out.println("Greater than 10: ");
        method1(p1,arr);
        System.out.println("Even Numbers: ");
        method1(p2,arr);
        System.out.println("Not Greater than 10: ");
        method1(p1.negate(),arr);
        System.out.println("Greater than 10 and Even: ");
        method1(p1.and(p2),arr);
        System.out.println("Not Greater than 10 and Even: ");
        method1(p1.negate().and(p2),arr);



    }

    public static void method1(Predicate<Integer> p,int arr[])
    {
        for(int i:arr)
        {
            if(p.test(i))
            {
                System.out.println(i);
            }
        }
    }
}
