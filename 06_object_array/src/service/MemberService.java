package service;

import dto.MemberDTO;

// Service(제공하다)
// - 필요한 기능(비즈니스 로직)을 제공하는 클래스

public class MemberService {
	/* 객체 배열
	 * - 객체를 참조하는 참조형 변수를 묶음으로 다루는 것
	 * 
	 * [작성법]
	 * 클래스명[] 변수명 = new 클래스명[크기];
	 * 
	 * ex)
	 * Academy[] arr = new Academy[3];
	 * - new Academy[3] : heap 영역에 Academy "참조형 변수" 3칸 짜리 묶음 배열
	 *   --> 각 칸이 Academy "참조형 변수"
	 *       --> 각 칸이 Academy 객체 주소를 저장해서 참조
	 */
	/** 객체 배열 생성 / 초기화 / 활용 */
	public void method1() {
		// MemberDTO 참조형 변수 3칸짜리 배열을 생성하고 memberArr가 참조
		MemberDTO[] memberArr = new MemberDTO[3];
		
		// memberArr가 참조하는 배열의 각 인덱스 번째 칸은 MemberDTO "참조형 변수"이다!!
		
		// 인덱스별로 MemberDTO 객체로 초기화
		memberArr[0] = new MemberDTO("member1", "pass01", "강진형", 26);
		memberArr[1] = new MemberDTO("member2", "pass02", "박현정", 26);
		memberArr[2] = new MemberDTO("member3", "pass03", "삼순이", 33);
		
		// memberArr의 요소가 참조하는 모든 MemberDTO 객체의 저장된 필드 정보를 출력
		
//		memberArr[0].inform();
//		memberArr[1].inform();
//		memberArr[2].inform();
		
		/* 객체 배열 + for문 */
		
		// 일반 for문
		for(int i = 0; i < memberArr.length; i++) memberArr[i].inform();	
		
		System.out.println("=================================");
		System.out.println("=================================");
		
		// 향상된 for문 
		for(MemberDTO mem : memberArr) mem.inform();
	}	
	// Stack 
	// - 호출된 메서드가 쌓이는 영역
	// - 메서드 내 지역변수도 Stack 영역에 생성
	
	// Heap 
	// - 동적 메모리 영역
	// - 프로그램 실행 중 객체가 생성 / 소멸하는 영역
	// - new 연산자를 이용해 클래스에 정의된 내용대로 객체(Instance)를 생성	
	// - 소멸 : Garbage Collection이 일정 시간 마다 사용되지 않는 객체를 소멸
	
	// Static
	// - 정적 메모리 영역
	// - 프로그램 실행 시 static 키워드가 붙은 필드 / 메서드를 static 영역에 생성
	// - 어디서든 공유 가능(단, public일 경우)
	// - 클래스명.필드명 / 클래스명.메서드명() 으로 호출
	
	// * 메소드 반환형 *
	// - 배열, 클래스는 얕은 복사
	// 얕은 복사 : 주소만 복사, 원본을 공유
	
	
	
	
	
	
	
	
	
	
}
