package oop;

public class 은닉성Sample2 {
 //멤버에는 변수,필드,속성이 있다. 
	int kor; //숫자의 디폴트값은 0이다. 그럼 boolean은 false가 디폴트 값이겠다.
	String name; //클래스 안에 있는 자리.  원시자료형은 0 객체자료형은 null <-참고하는 주소,데이터가 없다는 출력 / 나는 기억할 준비가 되어있는데 들어있는게 없어요~
	
	void method() {
		System.out.println(kor*10+" "+name);
	}
}
//inner class
class 기생충 {
	String type;
	void method() {
		
	}
}
//모두 앞에 접근유형이 없다. int 앞에, void 앞에..그 말은 디폴트 접근방식이라는 뜻이다.
//즉, 이 클래스안에서만 사용 가능하다. 전국구로 하고 싶다면 퍼블릭으로 고치면 된다. 
//내 새끼도 모르게하고싶다, 하면 프라이빗.
//