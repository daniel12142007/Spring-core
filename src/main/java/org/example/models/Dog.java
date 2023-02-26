package org.example.models;

import org.example.interfaces.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    public String minus() {
return "Dogs need a lot of care";
    }

    public String plus() {
return "Dogs have a very good sense of smell";
    }
}
