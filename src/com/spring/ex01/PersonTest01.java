package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest01 {
    public static void main(String[] arg){

        BeanFactory factory =
                new XmlBeanFactory(new FileSystemResource("person.xml"));

        PersonService01 person =
                (PersonService01) factory.getBean("personService");

        person.sayHello();
        System.out.println();

        PersonService01 personService2 =
                (PersonService01) factory.getBean("personService2");
        person.sayHello();
        System.out.println();
        PersonService01 personService3 =
                (PersonService01) factory.getBean("personService3");
        person.sayHello();

    }
}
