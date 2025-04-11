package com.example.spring_boot_ex9_beans_creatingregister;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringBootEx9BeansCreatingregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEx9BeansCreatingregisterApplication.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle volkswagan = new Vehicle ();
		volkswagan.setName("Volkswagen");
		Supplier<Vehicle> volkswagenSupplier = () -> volkswagan;

		Supplier <Vehicle> audiSupplier = ()-> {
			Vehicle audi = new Vehicle ();
			audi.setName("Audi");
			return audi;
		};

		Random ran  = new Random();
		int ranN = ran.nextInt(10);
		System.out.println("Random number is " + ranN);

		if ((ranN % 3)== 0){
			context.registerBean("volkswagen", Vehicle.class , volkswagenSupplier);

		}else{
			context.registerBean("audi", Vehicle.class , audiSupplier);
		}
		Vehicle volksVehicle = null ;
		Vehicle audiVehicle = null;
		try{
			volksVehicle = context.getBean("volkswagan" , Vehicle.class);
		}catch(NoSuchBeanDefinitionException e){
			System.out.println("Error while createing volkswagen vehicle bean");
		}
		try {
			audiVehicle = context.getBean("audi", Vehicle.class);
		}catch(NoSuchBeanDefinitionException e) {
			System.out.println("Error while createing audi vehicle bean");
		}

		if (null != volksVehicle ){
			System.out.println("Programmming Vehicle name from spring context is " + volksVehicle.getName());

		}else {
			System.out.println("Programmming Vehicle name from spring context is " + audiVehicle.getName());
		}
	}

}
