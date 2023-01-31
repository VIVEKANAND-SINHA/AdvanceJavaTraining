package com.vivekanand.SpringFile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main( String[] args )
    {
        ApplicationContext cnxt = new ClassPathXmlApplicationContext("beans.xml");
        Question36 obj = (Question36) cnxt.getBean("hello");
        obj.setMessage("Hello world this is vivekanand");
        System.out.println("This is Question 37 Output");
        obj.getMessage();
		Question38 obj2 = (Question38) cnxt.getBean("student");
		System.out.println("This is Question 38 Output");
		obj2.display();
		Question39 obj3 = (Question39) cnxt.getBean("employee");
		System.out.println("This is Question 38 Output");
		obj3.displaydetails();
		
		Tyre obj4 = (Tyre)cnxt.getBean("tyre");
		System.out.print(obj4.toString());
		
    }
}
