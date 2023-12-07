package com.javalec.base;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.company = " + car1.company);
		
		System.out.println("------------------------------");
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company = " + car2.company); // 소괄호가 없는 것은 다 Field다.
		System.out.println("car2.company = " + car2.model);
		
				
		

	}

}
