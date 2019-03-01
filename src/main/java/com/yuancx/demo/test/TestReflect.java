package com.yuancx.demo.test;

public class TestReflect {




    public static void main(String args[]){

        Object object = new Student();

        Class  aClass = object.getClass();

        aClass.getName();


    }


}
