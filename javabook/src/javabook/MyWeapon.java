package javabook;

public class MyWeapon implements Weapon{
	int curPower;
	public void fire(int power) {
		curPower -= power;
	}
	public int getRestPower() {
		return curPower;
	}
	public int charge(int power) {
		curPower += power;
		return curPower;
	}
}
