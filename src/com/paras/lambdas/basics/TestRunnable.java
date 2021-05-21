package com.paras.lambdas.basics;

public class TestRunnable {
    public static void main(String[] args) {
//         Runnable r=new MyRunnableImpl();
//         Thread t=new Thread(r);
//         t.start();

        Runnable r=()->{
          for(int i=0;i<10;i++)
              System.out.println("Inside child thread");
        };
        Thread t=new Thread(r);
        t.start();

         for(int i=0;i<10;i++)
         {
             System.out.println("Inside main thread ");
         }
    }
}
