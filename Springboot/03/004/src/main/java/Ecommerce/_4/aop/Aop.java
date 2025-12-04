package Ecommerce._4.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"Ecommerce._4.aop"})
@EnableAspectJAutoProxy
public class Aop {
}
