package javabook;

import java.util.Scanner;

public class Ch03_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���� �Է�");
			String price = scan.next();
			
			if(!price.equals("q")) {
				int priceInt = Integer.parseInt(price);
				total += priceInt;
			}
			if (price.equals("q")) {
				System.out.println("�Ѿ� : " + total);
				break;
			}
		}

	}

}
