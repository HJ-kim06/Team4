package javabook;

import java.util.Scanner;

public class Ch03_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 10000;
		Scanner scan = new Scanner(System.in);
		System.out.println("��� �ݾ�");
		String str = scan.next();
		
		int num = Integer.parseInt(str);
		money -= num;
		
		if(money < num) System.out.println("�ܾ��� ������ ���� ī�带 ����� �� �����ϴ�!!");
	}

}
