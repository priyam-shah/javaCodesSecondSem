package oops;

class Vehicle {
	int  wheels ;
	int headlights ; 
	
	Vehicle(int wheels) {
		this.wheels = wheels;
		headlights = 2; 
	}
}

public class MyConstructor {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle(2);
		
		System.out.println(car.wheels);
		System.out.println(bike.wheels);
		System.out.println(car.headlights);		
	}

}
