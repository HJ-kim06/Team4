package javabook;

public class MyMemberInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInfo ref = new MemberInfo("������", MemberType.Young);
		System.out.println("ȸ����ȣ : " + ref.getMemberNum() + " �̸� : " + ref.getName() + " ȸ�� ��� : " + ref.getMemberType());

	}

}
