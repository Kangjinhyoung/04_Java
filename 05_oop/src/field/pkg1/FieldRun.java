package field.pkg1;

public class FieldRun {
	public static void main(String[] args) {
		
		// FieldTest1 객체 생성
		FieldTest1 f1 = new FieldTest1();
		f1.method();
		
		// public 필드 직접 접근
		System.out.println(f1.publicValue); // 100
		
		// protected 필드 직접 접근 -> 같은 패키지라서 가능!
		System.out.println(f1.protectedValue); // 200
		
		// (default) 필드 직접 접근 -> 같은 패키지라서 가능!
		System.out.println(f1.defaultValue); // 300
		
		// private 필드 직접 접근 -> 문제 발생
		// - 다른 곳 / 객체가 private(개인적인) 필드 접근할 수 없다!
		// System.out.println(f1.privateValue);
	}
}
