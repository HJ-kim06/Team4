package 정리;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OverTest_param {
	static public void callAA(AA ref) {
		System.out.println("callAA(SubAA ref)");
		ref.m1();

	}

	static public void callAA(SubAA ref) {
		System.out.println("callAA(SubAA ref)");
		ref.m1();

	}

	static public void callAA(SubAASub ref) {
		System.out.println("callAA(SubAA ref)");
		ref.m1();

	}

	public static void main(String[] args) {
		callAA(new SubAA());
		System.out.println("///////////////");
		callAA(new BBAA());

		System.out.println("///////////////");
		System.out.println(new Date());
		System.out.println(new BBAA());
		System.err.printf("%d", 10); // 대문자 인티저로 바뀐다. 형변환이 자동으로 됨

		AA aaa = new SubAA();// 업캐스팅
		AA aa22 = new BBAA(); //SubAA것을 가져가 바꾸어서 쓸 수 없다. 
		SubAA rrr = (SubAA) aaa;//가능
			  rrr = (SubAA) aa22;//불가능
			  
			  
		int qq = 10;
		Integer ii = new Integer(qq);
		ii = qq;
		qq = new Integer(77);//랩퍼클래스. 원시자료형의 성격을 가지고 있으면서 오브젝트화 시키는 것
	}
}
