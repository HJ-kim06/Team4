package javabook;

public class MemberInfo {
	private String name;
	private int memberNum;
	private MemberType memberType;

	public MemberInfo() {

	}

	public MemberInfo(String name, MemberType memberType) {
		this.name = name;
		this.memberType = memberType;
		memberNum++;
	}
	
	public int getMemberNum() {
		return memberNum;
	}

	public String getName() {
		return name;
	}

	public MemberType getMemberType() {
		return memberType;
	}
}
