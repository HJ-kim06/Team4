package 정리;

class SubAA2 extends AA2 {
	@Override // 에러가 나면 오버로딩이 된거고 안나면 오버라이드 된것.
	void m1() { // #1,6라고 하고 싶지만 #1번의 것을 가리고 있게 된다.
		System.out.println("SubAA의 m1()");
	}

	// double형은 기초클래스에 더블형이 존재하지 않기 때문에
	// @Override이 아니라 중복된 overload이다.
	void m1(double a) { // #6

	}

	/*void m1(int[] a) { // #7 -기초클래스것 까지 합쳐서 들어와서 7개다.
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
