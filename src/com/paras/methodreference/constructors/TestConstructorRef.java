package com.paras.methodreference.constructors;

public class TestConstructorRef {
    public static void main(String[] args) {

       // MyInterface m=s->new MyClass(s);
        //m.get("Paras");
        MyInterface m=MyClass::new;
        m.get("Lambdas");
    }
}
