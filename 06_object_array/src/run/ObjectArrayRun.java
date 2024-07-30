package run;

import service.MemberService;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		// MemberService 객체를 생성
		// -> MemberService 생성자를 작성한 적 없다!
		// 	  ->> 그러면 컴파일러가 기본 생성자를 만들어줌 ㅋㅋ
		MemberService service = new MemberService();
		
		service.method1();
	}
}
