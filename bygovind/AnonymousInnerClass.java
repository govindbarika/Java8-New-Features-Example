package com.example.demo.java8.newfeature.bygovind;
/*
abstract class Test{

}*/
interface Test{
    void m1();
    void m2();
    void m3();
}
public class AnonymousInnerClass {
    Test t = new Test(){
    public void m1(){};
    public void m2(){};
    public void m3(){};
    };
}


