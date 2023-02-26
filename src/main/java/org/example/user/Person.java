package org.example.user;

import lombok.Data;
import org.example.interfaces.Animal;

@Data
public class Person {
    private String name;
    private int age;
    private Animal animal;
}
