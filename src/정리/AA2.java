package 정리;

public class AA2 {

	/*void m1() {// 매개변수 x
		System.out.println("subAA의 m1()");{
	}*/
	public void m1(int ...a) { //...은 varargs = variable Arguments 가변인자
							   //오버로딩을 줄이기 위해서,정리하기 위해서 사용
		
		System.out.println("int ...a");
		for(int d : a) {
			System.out.println(d);
		}
	}

	/*void m1(int a) {//#2
		System.out.println(a);
	}

	void m1(int a, int b) {//#3
		System.out.println(a+b);
	}

	void m1(int a, int b, int c) {//#4
		System.out.println(a+b+c);
	}*/

	public void m1(String a) {//#5

	}
}
