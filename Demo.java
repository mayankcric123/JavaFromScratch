package com.java.from.scratch;


public class Demo {

    String value = "mayank";
    static String staticValue = " mayank class";

    public static void main(String[] args) {



        Demo demo = new Demo();
        int result = demo.add(5,4);
        System.out.println("The result is " + result);
        String name = demo.returnName("sonal");
        System.out.println("The name is " + name);
        demo.returnNoting("sonal");
        System.out.println(demo.value);
        System.out.println(Demo.staticValue);
        int substractionResult = Demo.substract(9,4);
        System.out.println("The result is " + substractionResult);

    }

    int add(int a,int b){
        int c=a + b;
        return c;
    }

    static int substract(int a,int b){
        int c=a - b;
        return c;
    }

    String returnName(String name){
        return name;
    }

    void returnNoting(String name){
        System.out.println("I'll return nothing and my name is " + name);
    }
}
