package ����;

public class AA2 {

	/*void m1() {// �Ű����� x
		System.out.println("subAA�� m1()");{
	}*/
	public void m1(int ...a) { //...�� varargs = variable Arguments ��������
							   //�����ε��� ���̱� ���ؼ�,�����ϱ� ���ؼ� ���
		
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
