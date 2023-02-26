package org.example.models;

import org.example.interfaces.Animal;
import org.springframework.stereotype.Component;

@Component("eagle")
public class Eagle implements Animal {
    public String minus() {
        return "Eagles can harm a person";
    }

    public String plus() {
        return "Eagles have very good eyesight";
    }
}