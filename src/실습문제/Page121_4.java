package 실습문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//IT에서 consol

/*연소득
신용등급
기존고객
     발급상태 */
public class Page121_4 {
	private int annualIncome;// 연소득 0
	private char creditRaing;// 신용등급 0
	private boolean isMember;// 기존맴버 false
	private String issuanceStatus;// 발급상태 null

	private BufferedReader reader; // 인풋에 관계된걸 씀

	public Page121_4() {
		reader = new BufferedReader(
				new InputStreamReader(
						System.in
					)
				);// 인풋스트림을 리더로 바꿔주는,읽어들이는
	}

	public void consolInput() {
		try {
			
	
		System.out.print("연소득? "); 
		annualIncome = Integer.parseInt(reader.readLine());
		
		System.out.println("A,B,C,D,F 중에 입력하세요.");	
		System.out.print("신용등급? ");
		String s = reader.readLine(); 
		if(s.length()==1 && s.equalsIgnoreCase("A") ||s.equalsIgnoreCase("B") ||
			s.equalsIgnoreCase("C")) {
			
			//toUpperCase 대문자로 
		creditRaing = s.toUpperCase().charAt(0);//데이터 하나만 읽어드릴거라 0
		}else {
			reInput("A,B,C,D,F 중에 입력하세요.");	
		}
	
		System.out.println("기존 고객은 T, 신규 고객은 F");
		System.out.print("기존 고객인가요?");
		s = reader.readLine(); 
		if(s.length() == 1 && s.equalsIgnoreCase("T") || s.equalsIgnoreCase("F")){
			isMember = true;
			
		}else {
			reInput("기존 고객은 T, 신규 고객은 F");
		}
		
		
		membershipCondition();
		
		}catch (IOException e) {
		System.out.println("입력을 받아서 exception이 풀림");//아무것도 안나옴
	}catch (NumberFormatException e) {
		reInput("숫자를 입력하세요 ");//다시 입력 받으세요.
	}catch (Exception e) {
		reInput("예상하지 못한 예외 ");
	}
	}
	private void reInput(String msg) {
		System.out.println(msg);
		consolInput();
	}
	/*1.연소득이 5000만원이상 또는(||)
	신용등급이 B 이상
	2.기존고객
	1&&2*/
	protected void membershipCondition() {
		if(annualIncome >= 5000000 || creditRaing >= 'B') {
			if(isMember)issuanceStatus = "발급 대상";
			
		}
		else issuanceStatus = "발급 대상 제외";
		
	}

	public void consolOutput() {
		System.out.println("연소득	  신용등급 	  기존고객  	발급상태");
		System.out.printf("%,12d%5c%8b%10s\n",
					annualIncome,creditRaing,isMember,issuanceStatus);
	}
}
