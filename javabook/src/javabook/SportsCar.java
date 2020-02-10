package javabook;

public class SportsCar extends Car{
	public SportsCar() {
		
	}
	
	@Override
	public int speedUp() {
		return Car.curSpeed += 1;
	}
	
	@Override
	public int speedDown() {
		return Car.curSpeed -= 1;
	}
}
