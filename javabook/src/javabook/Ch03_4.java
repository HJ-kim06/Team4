package javabook;

import java.util.Scanner;
public class Ch03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ҵ� �Է�(���� : �� �� )");
		int yearMoney = scan.nextInt();
		
		System.out.println("�ſ� ��� �Է�");
		char trustGrade = scan.next().charAt(0);
		
		System.out.println("�ű�? ����?");
		String client = scan.next();
		
		if((yearMoney >= 500 || trustGrade <= 'B') && client.equals("����"))
			System.out.println("�߱� ����");
		else System.out.println("�߱� �Ұ���");
	}
}
