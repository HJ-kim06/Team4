package ����;

import java.util.ArrayList;
import java.util.List;

public class OverTest {
	

		
	public static void main(String[] args) {
		AA ref = new AA();//��ĳ����
		SubAA ref2 = new SubAA();
		ref.m1(); //AA  //���� ���� static binding
		ref2.m1();//SubAA //���� ���� static binding
		
		AA refX = new SubAA();
		refX.m1();//���� ���� dynamic binding
		refX = new SubAASub();
		refX.m1();
		refX = new AA();
		refX.m1();
		
		List refff = new ArrayList();
		refff.add("dsdsds");
		//refff = new List();
	}
}
