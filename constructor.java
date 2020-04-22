package oops;

class Vehicle {
	int  wheels ;
	int headlights ; 
	String color ;
	
	Vehicle(int wheels) {
		this.wheels = wheels;
		headlights = 2; 
	}
	
	Vehicle(int wheels , String color) {
		this.wheels = wheels ;
		this.color = color ;
		headlights = 2 ;
	}
} 

public class MyConstructor {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle(2);
		Vehicle eRikshaw = new Vehicle(3 ,"green");
		
		System.out.println(car.wheels + " wheels");
		System.out.println(bike.wheels + " wheels");
		System.out.println(car.headlights + " headlights");
		System.out.println(eRikshaw.wheels + " wheels and color " + eRikshaw.color);
		
	}

}
