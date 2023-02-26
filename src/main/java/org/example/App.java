package org.example;

import org.example.MyConfiguration.Myconfig;
import org.example.interfaces.Animal;
import org.example.user.Person;
import org.example.user.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Myconfig.class);
        Person person = (Person) app.getBean("person");
        User user = (User) app.getBean("user");
        person.setAnimal((Animal) app.getBean("cat"));
        System.out.println(person);
        user.setAnimal((Animal) app.getBean("dog"));
        System.out.println(user);
    }
}