package modifier;

import oop.MemberTest;
import oop.은닉성Sample;

public class DefaultClassAccessEro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	}
MemberTest t; // import.oop.MemberTest;를 위에 써줘야한다. 멤버테스트에 접근하겠습니다.
}


은닉성 Sample s;//여기는 모디파이어 패키지. 은닉성을 사용할 수 없다.  
           //은닉성 샘플은 클래스가 디폴트로 되어있다. 즉 같은 패키지가 아니면 접근할 수 없기 때문에 에러가 뜬다. /