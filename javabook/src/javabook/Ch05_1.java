package javabook;

public class Ch05_1 {
	private String memberLevel;
	public String msg;

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	
	public String levelMsg(String memberLevel) {
		switch (memberLevel) {
		case "VIP":
			return msg = "VIP �� ���� ����";
		case "NEW":
			return msg = "�ű� �� ���� ����";
		case "YOUNG":
			return msg = "û�ҳ� �� ���� ����";
		default:
			return msg = "��޾���";
		}
	}
	
	public void output() {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String memberLevel = "YOUNG";
		Ch05_1 ref = new Ch05_1();
		ref.setMemberLevel(memberLevel);
		ref.levelMsg(ref.getMemberLevel());
		ref.output();

	}

}
