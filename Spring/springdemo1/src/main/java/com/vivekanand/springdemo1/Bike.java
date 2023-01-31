package com.vivekanand.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical {

	public void Drive() {
		System.out.println("This is bike running!!!");
		
	}

}
