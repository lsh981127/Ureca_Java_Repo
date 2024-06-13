package com.ureca.school;
import java.util.*;
public class ListArray {

	public static void main(String[] args) {
		int[] ia = new int[3];
		ia[0] = 'a';
		System.out.println(Arrays.toString(ia));
		System.out.println();
		
		List<Integer>[] la = new List[3];    // 객체 선언부에는 new List<> X <> 주면 안된다
			
//		la[0].add(123);  		// NullPointerException 발생, la 안에는 다 Null인데 거기에 값을 넣으려 해서 그렇다.
		for(int i = 0; i<la.length; i++) la[i] = new ArrayList<>();
		la[0].add(123);
		
		/**
		 * List 생성하면 초기값은 Null 이고. 각 값으로 ArrayList를 넣어줘야한다.
		 * 
		 * 배열에 왜 ArrayList가 안되는 이유?
		 * 
		 * 
		 */
		
		
		System.out.println(la[0]);
		System.out.println(Arrays.toString(la));
		

	}

}
