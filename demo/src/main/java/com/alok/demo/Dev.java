package com.alok.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//    @Component annotation tells the spring framework - objects of which classes spring have to
//    create and manage its life cycle.
@Component
public class Dev {

//    Here learned about the @Autowired annotation and @Qualifier annotation, how they work and
//    where they should use

    @Autowired     // Field Injection
    @Qualifier("desktop")
    private Computer computer;

//    Constructor Injection
//    Here @Autowired is by default picked by jvm and we dont have to write it manually
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    @Autowired  //  Setter Injection
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        computer.compile();
        System.out.println("I am building something");
    }
}
