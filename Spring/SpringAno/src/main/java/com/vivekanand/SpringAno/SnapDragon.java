package com.vivekanand.SpringAno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("World's Best Processor");
		
	}

}
