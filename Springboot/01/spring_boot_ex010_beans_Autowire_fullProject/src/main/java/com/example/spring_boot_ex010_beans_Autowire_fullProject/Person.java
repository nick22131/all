package com.example.spring_boot_ex010_beans_Autowire_fullProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component (value = "personBean")
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle ;

    @Autowired
    public Person (Vehicle vehicle ) {
        this.vehicle = vehicle;
    }
    public String getName(){
        return name ;
    }
    public void setName (String name ){
        this.name = name;
    }
}

