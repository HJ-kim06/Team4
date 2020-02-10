package javabook;

public class Car {
	String maker;
	String model;
	String color;
	static int curSpeed;
	
	public Car() {
		
	}
	
	public Car(String maker, String model, String color, int curSpeed) {
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.curSpeed = curSpeed;
	}
	
	public int speedUp() {
		return curSpeed += 1;
	}
	
	public int speedDown() {
		return curSpeed -= 1;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("����Ŀ1", "��1", "ȸ��", 100);
		Car car2 = new Car("����Ŀ2", "��2", "������", 200);
		Car car3 = new Car("����Ŀ3", "��3", "���", 300);
		
	}
}
