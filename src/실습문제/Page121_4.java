package �ǽ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//IT���� consol

/*���ҵ�
�ſ���
������
     �߱޻��� */
public class Page121_4 {
	private int annualIncome;// ���ҵ� 0
	private char creditRaing;// �ſ��� 0
	private boolean isMember;// �����ɹ� false
	private String issuanceStatus;// �߱޻��� null

	private BufferedReader reader; // ��ǲ�� ����Ȱ� ��

	public Page121_4() {
		reader = new BufferedReader(
				new InputStreamReader(
						System.in
					)
				);// ��ǲ��Ʈ���� ������ �ٲ��ִ�,�о���̴�
	}

	public void consolInput() {
		try {
			
	
		System.out.print("���ҵ�? "); 
		annualIncome = Integer.parseInt(reader.readLine());
		
		System.out.println("A,B,C,D,F �߿� �Է��ϼ���.");	
		System.out.print("�ſ���? ");
		String s = reader.readLine(); 
		if(s.length()==1 && s.equalsIgnoreCase("A") ||s.equalsIgnoreCase("B") ||
			s.equalsIgnoreCase("C")) {
			
			//toUpperCase �빮�ڷ� 
		creditRaing = s.toUpperCase().charAt(0);//������ �ϳ��� �о�帱�Ŷ� 0
		}else {
			reInput("A,B,C,D,F �߿� �Է��ϼ���.");	
		}
	
		System.out.println("���� ���� T, �ű� ���� F");
		System.out.print("���� ���ΰ���?");
		s = reader.readLine(); 
		if(s.length() == 1 && s.equalsIgnoreCase("T") || s.equalsIgnoreCase("F")){
			isMember = true;
			
		}else {
			reInput("���� ���� T, �ű� ���� F");
		}
		
		
		membershipCondition();
		
		}catch (IOException e) {
		System.out.println("�Է��� �޾Ƽ� exception�� Ǯ��");//�ƹ��͵� �ȳ���
	}catch (NumberFormatException e) {
		reInput("���ڸ� �Է��ϼ��� ");//�ٽ� �Է� ��������.
	}catch (Exception e) {
		reInput("�������� ���� ���� ");
	}
	}
	private void reInput(String msg) {
		System.out.println(msg);
		consolInput();
	}
	/*1.���ҵ��� 5000�����̻� �Ǵ�(||)
	�ſ����� B �̻�
	2.������
	1&&2*/
	protected void membershipCondition() {
		if(annualIncome >= 5000000 || creditRaing >= 'B') {
			if(isMember)issuanceStatus = "�߱� ���";
			
		}
		else issuanceStatus = "�߱� ��� ����";
		
	}

	public void consolOutput() {
		System.out.println("���ҵ�	  �ſ��� 	  ������  	�߱޻���");
		System.out.printf("%,12d%5c%8b%10s\n",
					annualIncome,creditRaing,isMember,issuanceStatus);
	}
}
