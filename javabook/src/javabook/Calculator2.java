package javabook;

public class Calculator2 {
	private int num1;
	private int num2;
	private String oper;
	
	public Calculator2() {
		
	}
	
	public Calculator2(int num1, int num2, String oper) {
		this.num1 = num1;
		this.num2 = num2;
		this.oper = oper;
	}
	
	public int calc() {
		int result;
		switch(oper) {
		case "+":
			return result = num1 + num2;
		case "-":
			return result = num1 - num2;
		case "*":
			return result = num1*num2;
		case "/":
			return result = num1/num2;
		default:
			return result = 0;
		}
	}
}
