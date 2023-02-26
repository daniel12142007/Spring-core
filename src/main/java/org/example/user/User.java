package org.example.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.interfaces.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
@NoArgsConstructor
@Data
public class User {
    @Value("${u.names}")
    private String name;
    @Value("${u.age}")
    private int age;
    private Animal animal;

    public User(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "User{" +
               "name->'" + name + '\'' +
               ", age->" + age +
               ", animal_plus->" + animal.plus() +
               ", animal_minus->" + animal.minus() +
               '}';
    }
}