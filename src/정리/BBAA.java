package 정리;

public class BBAA extends AA {
	@Override
	public String toString() {
		return "BBAA 내가 재정의한 toString(),Object의 toString()==>"
				+ super.toString();
	}

	@Override
	public void m1() {
		System.out.println("BBAA m1()");
	}
	
}
