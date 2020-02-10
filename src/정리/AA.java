package 정리;

public class AA {

	void m1() {// 매개변수 x
		System.out.println("subAA의 m1()");
	}

	void m1(int a) {//#2
		System.out.println(a);
	}

	void m1(int a, int b) {//#3
		System.out.println(a+b);
	}

	void m1(int a, int b, int c) {//#4
		System.out.println(a+b+c);
	}

	void m1(String a) {//#5

	}
}
