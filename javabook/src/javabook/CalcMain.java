package javabook;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� ?");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���� ?");
		int num2 = scan.nextInt();
		
		System.out.println("������ ?(+,-,*,/)");
		String oper = scan.next();
		
		Calculator2 calcRef = new Calculator2(num1, num2, oper);
		System.out.println(num1 + oper + num2 + "=" + calcRef.calc());
	}

}
