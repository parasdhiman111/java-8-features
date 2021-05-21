package com.paras.lambdas.anonymous;

public class TestRunnableAnonymous {

    public static void main(String[] args) {

//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<10;i++)
//                {
//                    System.out.println("Inside child thread ");
//                }
//            }
//        });

        Thread t=new Thread(() -> {
            for(int i=0;i<10;i++)
            {
                System.out.println("Inside child thread ");
            }
        });


        t.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("Inside main thread ");
        }
    }
}
