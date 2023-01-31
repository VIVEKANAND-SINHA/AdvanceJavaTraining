package com.vivekanand.springdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car  implements Vehical{
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public void Drive() {
		System.out.println("Car is Driving!!");
		System.out.println("driving car : \n" + tyre);
	}
	 public String toString() {
		 return "tyre is working in car";
	 }

}
