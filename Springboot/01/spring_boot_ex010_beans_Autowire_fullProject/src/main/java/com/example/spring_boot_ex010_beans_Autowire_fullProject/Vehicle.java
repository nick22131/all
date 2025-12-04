package com.example.spring_boot_ex010_beans_Autowire_fullProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("vehicleBean")
public class Vehicle {
private String name = "Honda ";
private final VehicleServices vehicleServices;

@Autowired
    public Vehicle (VehicleServices vehicleServices){
    this.vehicleServices = vehicleServices;
   }
   public String getName (){
    return name ;
  }
  public void setName(String name ){
    this.name = name;
  }

}
