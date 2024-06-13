package com.ureca.day2;

import java.util.Arrays;

public class CopyofTest {

	public static void main(String[] args) {
		int[] ia = {90, 80, 100};
		
		// 인스턴스를 만들어준 뒤에, 새로운 값을 넣어주거나 수정하기 편해진다.
		ia = new int[] {90, 80, 100, 95};
		ia[3] = 85;
		
		System.out.println(Arrays.toString(ia));
		
		// 이건 우리가 인스턴스 만들고 값을 copy 하는 것
		int[] ib = new int[4];
		System.arraycopy(ia, 0, ib, 0, ia.length);
		System.out.println(Arrays.toString(ib));
		
		// copyof 메소드가 array 만들어서 하는 거고
		// 즉, 이게 DeepCopy하는 방법
		int[] ic = Arrays.copyOf(ia, 1);
		System.out.println(Arrays.toString(ic));
		System.out.println();

		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		// 결국 이건, shadow copy 하는 것!
		int[][] b = Arrays.copyOf(a, a.length);
		
		a[0][0] = 11;
		for (int[] b1:b) System.out.println(Arrays.toString(b1));System.out.println("");
		b[1][1] = 55;
		for (int[] b1:b) System.out.println(Arrays.toString(b1));System.out.println("");
		
		
		// 가장 무식하지만 자바에서는 이것만한 DeepCopy 방법이 없다!!
		// 게다라 이게 성능이 제일 좋다.
		int[][] c = new int[3][3];
		for(int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				c[i][j] = a[i][j];
			}
		}
		for (int[] c1:c) System.out.println(Arrays.toString(c1));
		
		
		
		
	}

}
