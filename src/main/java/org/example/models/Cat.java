package org.example.models;

import org.example.interfaces.Animal;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal {
    public String minus() {
        return "Cats are very lazy";
    }

    public String plus() {
        return "Cats are very flexible";
    }
}
