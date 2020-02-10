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
			System.out.println("��¡ �� �Ŀ� " + weapon.curPower);

			weapon.fire(power);
			System.out.println("�߻� �� �Ŀ�" + weapon.curPower);

			bossPower -= power;

			System.out.println("�����Ŀ� " + bossPower);

			unitPower -= power;
			System.out.println("���� �� ���� �Ŀ� " + unitPower);
			System.out.println();
		}

		if (bossPower <= 0) {
			System.out.println("������ óġ�ߴ�!");
			System.exit(1);
		}
	}

}
