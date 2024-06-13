package com.ureca.day2;

import java.util.Arrays;

public class Array5 {
	static final int[] di = {-1, 0, 1, 0};
	static final int[] dj = {0, 1, 0, -1};   // 어차피 고정값으로 사용할 것이니
	
	public static void main(String[] args) {
		int[][] ia = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			
			
			// 2차원 배열을 한눈으로 보기 위한 코드
			for(int[] a:ia) System.out.println(Arrays.toString(a)); System.out.println();// 이 줄을 필수적으로 암기해라!!
			
			int N = ia.length;
			int M = ia[0].length;
			
			
			// 4방 : 상우하좌
			for(int i=0; i<N; i++) {
				for (int j = 0; j < M; j++) {
					if (ia[i][j]==8) {  						
						System.out.println();
						for(int d=0; d<4; d++) {
							int ni=i+di[d];
							int nj=j+dj[d];
							if(0 <= ni && ni < N && 0 <= nj && nj < M) {    // 상하좌우가 가능한지 검사하고 가능할대만 출력하는 경우
								System.out.println(ia[ni][nj]);
							}
						}
						
					}
				}
			}
			
			
			
			
			
			// 8방 탐색: ㅁ 출력
			/*
			 * for(int i=0; i<ia.length; i++) { for (int j = 0; j < ia[i].length; j++) { if
			 * (ia[i][j]==5) {
			 * 
			 * // 1 2 3 4 6 7 8 9 순서 // int[] di = {-1, -1, -1, 0, 0, 1, 1, 1}; // int[] dj
			 * = {-1, 0, 1, -1, 1, -1, 0, 1};
			 * 
			 * 
			 * // 2 3 6 9 8 7 4 1 순서 int[] di = {-1, -1, 0, 1, 1, 1, 0, -1}; int[] dj = {0,
			 * 1, 1, 1, 0, -1, -1, -1};
			 * 
			 * System.out.println(); for(int d=0; d<8; d++) { int ni=i+di[d]; int
			 * nj=j+dj[d]; System.out.println(ia[ni][nj]); }
			 * 
			 * } } }
			 */
			
			
			/*
			 * // 4방 탐색: X자 출력 for(int i=0; i<ia.length; i++) { for (int j = 0; j <
			 * ia[i].length; j++) { if (ia[i][j]==5) { System.out.println(ia[i-1][j+1]); //
			 * 3 System.out.println(ia[i-1][j-1]); // 1 System.out.println(ia[i+1][j+1]); //
			 * 9 System.out.println(ia[i+1][j-1]); // 7
			 * 
			 * int[] di = {-1, -1, 1, 1}; int[] dj = {1, -1, -1, 1}; System.out.println();
			 * for(int d=0; d<4; d++) { int ni=i+di[d]; int nj=j+dj[d];
			 * System.out.println(ia[ni][nj]); }
			 * 
			 * } } }
			 */
			
			
			
			// 4방 탐색: 상하좌우
			/*
			 * for(int i=0; i<ia.length; i++) { for (int j = 0; j < ia[i].length; j++) { if
			 * (ia[i][j]==5) { System.out.println(ia[i-1][j+0]); // 2
			 * System.out.println(ia[i+1][j+0]); // 8 System.out.println(ia[i+0][j-1]); // 4
			 * System.out.println(ia[i+0][j+1]); // 6
			 * 
			 * int[] di = {-1, 1, 0, 0}; int[] dj = {0, 0, -1, 1}; System.out.println();
			 * for(int d=0; d<4; d++) { int ni=i+di[d]; int nj=j+dj[d];
			 * System.out.println(ia[ni][nj]); }
			 * 
			 * } } }
			 */
			
			
			
	}

}