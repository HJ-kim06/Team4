package javabook;

import java.util.Scanner;
public class Ch03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("연소득 입력(단위 : 만 원 )");
		int yearMoney = scan.nextInt();
		
		System.out.println("신용 등급 입력");
		char trustGrade = scan.next().charAt(0);
		
		System.out.println("신규? 기존?");
		String client = scan.next();
		
		if((yearMoney >= 500 || trustGrade <= 'B') && client.equals("기존"))
			System.out.println("발급 가능");
		else System.out.println("발급 불가능");
	}
}
