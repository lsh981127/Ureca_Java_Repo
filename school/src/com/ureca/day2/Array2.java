package com.ureca.day2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선언
		int[][] array2;
		/*
		 * 이렇게도 선언이 가능하다
		 * int ia[][]; 
		 * int[] ia[];
		 */
				
		// 생성
		array2 = new int[3][3];
		
		/*
		 * ia = new int[3][]; 
		 * 1차원 배열 3개 가지는 2차원 배열
		 */			
		
		int[][] ia;
		ia = new int[][] {
			{10,0,0},
			{0,11,0},
			{0,0,12}
		};
		
		
		for(int[] a:ia) {
			for(int b:a) {
				
			}
		}
		
		
		// 2차원 배열을 한눈으로 보기 위한 코드
		for(int[] a:ia) System.out.println(Arrays.toString(a)); // 이 줄을 필수적으로 암기해라!!
		
		
		
		System.out.println();
		
	}

}
