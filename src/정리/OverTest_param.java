package ����;

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
		System.err.printf("%d", 10); // �빮�� ��Ƽ���� �ٲ��. ����ȯ�� �ڵ����� ��

		AA aaa = new SubAA();// ��ĳ����
		AA aa22 = new BBAA(); //SubAA���� ������ �ٲپ �� �� ����. 
		SubAA rrr = (SubAA) aaa;//����
			  rrr = (SubAA) aa22;//�Ұ���
			  
			  
		int qq = 10;
		Integer ii = new Integer(qq);
		ii = qq;
		qq = new Integer(77);//����Ŭ����. �����ڷ����� ������ ������ �����鼭 ������Ʈȭ ��Ű�� ��
	}
}
