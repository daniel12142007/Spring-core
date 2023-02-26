package org.example.user;

import lombok.Data;
import org.example.interfaces.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
@Data
public class Person {
    @Value("${user.names}")
    private String name;
    @Value("${user.age}")
    private int age;
    private Animal animal;
}
