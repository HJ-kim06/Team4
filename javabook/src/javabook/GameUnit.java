package javabook;

public class GameUnit {
	static int bossPower = 1000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;

	public GameUnit() {

	}

	public GameUnit(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");

		while (true) {
			unit1.attack(500);
			unit2.attack(50);
		}

	}

	public void attack(int power) {
		if (unitPower > 0) {
			weapon = new MyWeapon();

			weapon.curPower = weapon.charge(unitPower);
			System.out.println("차징 후 파워 " + weapon.curPower);

			weapon.fire(power);
			System.out.println("발사 후 파워" + weapon.curPower);

			bossPower -= power;

			System.out.println("보스파워 " + bossPower);

			unitPower -= power;
			System.out.println("공격 후 유닛 파워 " + unitPower);
			System.out.println();
		}

		if (bossPower <= 0) {
			System.out.println("보스를 처치했다!");
			System.exit(1);
		}
	}

}
