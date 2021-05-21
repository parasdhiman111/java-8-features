package com.paras;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TextExplain {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> num=new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
                num.add(i);
        }
        
        List<Integer> even=new ArrayList<>();
        for(int i:num)
        {
            if(i%2==0)
                even.add(i);
        }

        Predicate<Integer> checkEven=p->p%2!=0;

        Predicate<String> check=s->s.startsWith("a");




    }

}
