package com.vivekanand.SpringAno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Annotations !!" );
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Samsung s8 = factory.getBean(Samsung.class);
        s8.config();
    }
}
