package practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	/* [실습 문제 1]
	길이가 9인 배열을 선언 및 할당하고, 
	1부터 9까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	짝수 번째 인덱스 값의 합을 출력하세요. 
	(0 번째 인덱스는 짝수로 취급)
	*/
	
	public void practice1() {

		int[] arr = new int[9]; // 길이가 9인 배열을 선언 및 할당
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		// 출력 및 합계
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) { // 짝수번째 인덱스 요소 합
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		int[] arr = new int[9]; // 길이가 9인 배열을 선언 및 할당
		// i	          : 0 1 2 3 4 5 6 7 8
		// arr.length     : 9 9 9 9 9 9 9 9 9
		// arr.length - i : 9 8 7 6 5 4 3 2 1 
		// arr[i]         : 9 8 7 6 5 4 3 2 1
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		// 출력 및 합계
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
			if(i % 2 != 0) sum += arr[i];			
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
		
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();	
		// 검색 값이 존재하면 false
		// 없으면 true
		boolean flag = false;
		
	    for (int i = 0; i < arr.length; i++) { // 검색
	    	// i번째 요소에 저장된 값과 검색할 값이 같은 경우
	         if (arr[i] == search) {
	             System.out.println("인덱스: " + i);  
	             flag = true; // 같은 값이 있으니 true로 변경
	         }
	     }
	    if(!flag) { // flag == false
	    	System.out.println("일치하는 값이 존재하지 않습니다.");
	    }
	}	       	    
	
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();		
			sum += arr[i];
		}		
		
		for(int value : arr)  System.out.print(value + " ");
		
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice6() {
		char[] arr = new char[14];
		
		System.out.print("주민등록번호 ( - 포함) : ");
		String str = sc.next();
		
		// 주민 등록 번호를 char 배열 요소로 하나씩 대입
		for(int i = 0; i < str.length(); i++) {
			
			if(i <= 7) arr[i] = str.charAt(i); // 성별까지
			else       arr[i] = '*';
			
			System.out.print(arr[i]);
		}
		
	}
	
	public void practice8() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
		System.out.print("발생한 난수 : ");
		for(int value : arr) {
			System.out.print(value + " ");
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
		System.out.print("발생한 난수 : ");
		for(int value : arr) {
			System.out.print(value + " ");
		}
		int max = arr[0];
	    int min = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	        
	        // 최대값과 최소값 출력
	    System.out.println("\n최대값 : " + max);
	    System.out.println("최소값 : " + min);
	}















}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


