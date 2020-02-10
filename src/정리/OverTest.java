package 정리;

import java.util.ArrayList;
import java.util.List;

public class OverTest {
	

		
	public static void main(String[] args) {
		AA ref = new AA();//업캐스팅
		SubAA ref2 = new SubAA();
		ref.m1(); //AA  //정적 결합 static binding
		ref2.m1();//SubAA //정적 결합 static binding
		
		AA refX = new SubAA();
		refX.m1();//동적 결합 dynamic binding
		refX = new SubAASub();
		refX.m1();
		refX = new AA();
		refX.m1();
		
		List refff = new ArrayList();
		refff.add("dsdsds");
		//refff = new List();
	}
}
