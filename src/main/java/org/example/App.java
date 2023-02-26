package org.example;

import org.example.MyConfiguration.Myconfig;
import org.example.models.Cat;
import org.example.user.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Myconfig.class);
        Person person = (Person) app.getBean("person");
        person.setAnimal(new Cat());
        System.out.println(person);
    }
}
