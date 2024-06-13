package com.ureca.day1;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		long l = 12L;
		float f = 1.2f;
		double d = 3.14;
		
		int j = 'A';
		float f1 = 123L;
		
//		byte b5 = 128; // byte 범위를 초과했기에 안된다~
		
		byte by = 1;
		short sh = 2;
		char ch = 'A';
		int k = i; 	/* ch, sh, by 대입 가능 */
		
		
		
		
		int h = (int)3.14;  
		
		System.out.printf("%.2f\n", 123.456);   // 둘다 \나 % 개행문자
		System.out.printf("%.2f%n", 123.456);
		System.out.printf("%.2f %% \n", 123.456);   // 소수점 2번재 자리에서 반올림해라
		
		
		
		System.out.println(1/3);	
		System.out.println(1/3.);
		System.out.println(1./3.);
		
		// 자바는 배열쓰기 않는다
		// Array list를 바로 쓴다. 동적으로 사용가능
		
		
	}

}
