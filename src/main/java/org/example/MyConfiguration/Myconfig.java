package org.example.MyConfiguration;

import org.example.interfaces.Animal;
import org.example.models.Cat;
import org.example.models.Dog;
import org.example.models.Eagle;
import org.example.user.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:daniel.properties")
public class Myconfig {
    @Bean("cat")
    public Animal cat() {
        return new Cat();
    }
    @Bean("dog")
    public Animal dog(){
        return new Dog();
    }
    @Bean("eagle")
    public Animal eagle(){
        return new Eagle();
    }
}