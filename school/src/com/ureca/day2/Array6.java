package com.ureca.day2;

import java.util.Arrays;

public class Array6 {
	static final int[] di = {-1, 0, 1, 0};
	static final int[] dj = {0, 1, 0, -1};   // 어차피 고정값으로 사용할 것이니
	
	public static void main(String[] args) {
		int[][] ia = {  // 9 X 9
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,9,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
			};
			
			
			// 2차원 배열을 한눈으로 보기 위한 코드
			for(int[] a:ia) System.out.println(Arrays.toString(a)); System.out.println();// 이 줄을 필수적으로 암기해라!!
			
			int N = ia.length;
			int M = ia[0].length;
			
			
			// 4방 : 상우하좌
			for(int i=0; i<N; i++) {
				for (int j = 0; j < M; j++) {
					if (ia[i][j] == 9) {
						System.out.println();
						for(int k = 1; k <= 4; k++) {
							for(int d=0; d<4; d++) {
								int ni=i+di[d] * k;
								int nj=j+dj[d] * k;
								if(0 <= ni && ni < N && 0 <= nj && nj < M) {    // 상하좌우가 가능한지 검사하고 가능할대만 출력하는 경우
									ia[ni][nj] = k;
									for(int[] a:ia) System.out.println(Arrays.toString(a)); System.out.println();
								}
							}
						}
						
					}
					
				}
			}
			
			// 이 줄을 필수적으로 암기해라!!

			
			
			
	}

}
