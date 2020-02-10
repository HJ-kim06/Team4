package javabook;

public class MyMemberInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInfo ref = new MemberInfo("이찬영", MemberType.Young);
		System.out.println("회원번호 : " + ref.getMemberNum() + " 이름 : " + ref.getName() + " 회원 등급 : " + ref.getMemberType());

	}

}
