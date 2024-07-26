package pkg3.run;

import pkg3.dto.BDHCalculator;
import pkg3.dto.Calculator;
import pkg3.dto.JIJCalculator;
import pkg3.dto.KHYCalculator;
import pkg3.dto.LKWCalculator;
import pkg3.dto.LYSCalculator;
import pkg3.dto.YJSCalculator;

public class CalculatorRun {
	public static void main(String[] args) {

		// 인터페이스도 추상클래스 처럼
		// - 객체 생성 X
		// - 부모 타입 참조 변수로 사용  O
		//   -> 다형성 업캐스팅 + 동적 바인딩

		// Calculator c = new BDHCalculator();
//		Calculator c = new JIJCalculator();
		Calculator c = new KHYCalculator();

		System.out.println( c.plus(90000000, 30000000) );
		System.out.println( c.minus(1, 30) );
		System.out.println( c.multi(7000, 123) );
		System.out.println( c.div(55555, 444) );
		System.out.println( c.mod(1234, 56) );
		System.out.println( c.pow(2, 16) );
		System.out.println( c.areaOfCircle(5.7) );
		System.out.println( c.toBinary(100) );
		System.out.println( c.toHexadecimal(100) );


		// 객체 배열
		Calculator[] arr = new Calculator[5];

		arr[0] = new BDHCalculator();
		arr[1] = new JIJCalculator();
		arr[2] = new KHYCalculator();
		arr[3] = new LKWCalculator();
//		arr[4] = new LYSCalculator();
		arr[4] = new YJSCalculator();

		for(Calculator cc : arr) {
			System.out.println(cc.toBinary(1024));
		}




	}
}