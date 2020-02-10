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
			return msg = "VIP 고객 혜택 적용";
		case "NEW":
			return msg = "신규 고객 혜택 적용";
		case "YOUNG":
			return msg = "청소년 고객 혜택 적용";
		default:
			return msg = "등급없음";
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
