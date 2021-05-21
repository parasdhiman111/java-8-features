package com.paras.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        for(int i=1;i<=10;i++)
            list1.add(i);

//       List<Integer> list2=new ArrayList<>();
//        for(int i:list1)
//        {
//            if(i%2==0)
//                list2.add(i);
//        }


  List<Integer> l2=list1.stream().filter(p->p%2==0).collect(Collectors.toList());

            System.out.println(l2);

        long count = list1.stream().filter(p -> p % 2 == 0).count();
        System.out.println(count);

        Comparator<Integer> comparator=(i1,i2)->i1.compareTo(i2);
        List<Integer> l3=list1.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(l3);
        Integer max = list1.stream().max(comparator).get();
        System.out.println(max);
        Integer min = list1.stream().min(comparator).get();
        System.out.println(min);

        list1.stream().forEach(i->System.out.println(i));

    }
}
