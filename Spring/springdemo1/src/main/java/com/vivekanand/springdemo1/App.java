package com.vivekanand.springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Vehical c=new Car();
//        c.drive();
        Vehical b=(Vehical) new Bike();
//        b.drive();
//        	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context1=new ClassPathXmlApplicationContext("spring.xml");
        
//          Vehicle obj=(Vehicle)context.getBean("bike");
//        Vehicle obj1=(Vehicle)context.getBean("bike");
//          
//       obj1.drive();
//        	Tyre t=(Tyre)context1.getBean("tyre");
        Car obj=(Car)context1.getBean("car");
        obj.Drive();
       	
         
//        System.out.println(t);
    }
}