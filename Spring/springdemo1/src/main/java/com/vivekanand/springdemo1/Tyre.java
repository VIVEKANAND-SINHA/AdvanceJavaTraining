package com.vivekanand.springdemo1;
import org.springframework.stereotype.Component;

@Component
public class Tyre  {
	
	
	private String brand;
	
//	public Tyre(String brand) {
//		System.out.println("constructor");
//		
////		super();
//		this.brand = brand;
//	}
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
		
	}
	
}