package ����;

class SubAA2 extends AA2 {
	@Override // ������ ���� �����ε��� �ȰŰ� �ȳ��� �������̵� �Ȱ�.
	void m1() { // #1,6��� �ϰ� ������ #1���� ���� ������ �ְ� �ȴ�.
		System.out.println("SubAA�� m1()");
	}

	// double���� ����Ŭ������ �������� �������� �ʱ� ������
	// @Override�� �ƴ϶� �ߺ��� overload�̴�.
	void m1(double a) { // #6

	}

	/*void m1(int[] a) { // #7 -����Ŭ������ ���� ���ļ� ���ͼ� 7����.
		int sum = 0;
		for (int data : a) {
			sum += data;
		}
		for (int data : a) {
			System.out.print(data + ",");
		}
		System.out.println(sum);
	}*/

	void out() {
		m1(); // this.m1();
		super.m1();
	}
}
