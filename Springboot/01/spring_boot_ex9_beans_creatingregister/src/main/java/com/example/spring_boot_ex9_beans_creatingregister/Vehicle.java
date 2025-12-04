package com.example.spring_boot_ex9_beans_creatingregister;

public class Vehicle {
    private String name;
    public String getName (){
        return this.name;
    }
    public void setName(String name ){
        this.name = name ;
    }

    public void printHello(){
        System.out.println("Printing hello component vehicle bean");
    }
}
