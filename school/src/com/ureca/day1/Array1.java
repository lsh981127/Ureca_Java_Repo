package com.ureca.day1;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 선언
		int[] a1;
		
		
		//2. 생성
		a1 = new int[3];
		// 자바에서 배열은 기본 타입이 아니기에 꼭 이렇게 자료형을 만들어줘야한다;.
		
//		int [] ia = {1,2,3};    이거  ok
//		
//		int[] ia = new int[] {1,2,3};   이거 ok
		
		/*
		 * int[] ia; 
		 * ia = {1,2,3}
		 * 
		 *  이렇게 선언하는 건 죽어도 안됨!!
		 */
		// 3. 사용
		
		
		
		// 4. 출력
		System.out.println(Arrays.toString(a1));
		
		// 1차원 배열에 대해 toString으로 찝어준다.
	}

}
