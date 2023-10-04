package com.spring.ex01;

public class PersonServiceImpl01 implements PersonService01{
    String name;
    int age;

    public PersonServiceImpl01() {

    }

    public void setName(String name){
        this.name = name;
    }

    public PersonServiceImpl01(String name){
        this.name = name;
    }
    public PersonServiceImpl01(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public void sayHello() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : "+age);
    }
}
