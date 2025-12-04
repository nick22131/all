package _3._1.entity;

public class Vehicle {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name ){
        this.name = name ;
    }
    public void printHello(){
        System.out.print("Printing hello from Component Vehicle Bean");
    }
}
