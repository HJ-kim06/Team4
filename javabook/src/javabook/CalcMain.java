package javabook;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 ?");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 ?");
		int num2 = scan.nextInt();
		
		System.out.println("연산자 ?(+,-,*,/)");
		String oper = scan.next();
		
		Calculator2 calcRef = new Calculator2(num1, num2, oper);
		System.out.println(num1 + oper + num2 + "=" + calcRef.calc());
	}

}
