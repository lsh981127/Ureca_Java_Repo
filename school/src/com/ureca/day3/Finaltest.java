package com.ureca.day3;

public class Finaltest {
	public static final int i = 11;   	// 상수, Class
	public static  		int j = 12;		// 변수, 클래스
	public        final int k = 13;		// 상수, Heap  (객체마다 고유값을 가지는 거기에 보통은 그냥 빈값으로 선언해둔뒤, 생성자에서 1번 수정한다.)
	public 		 		int l = 14;		// 변수, 인스턴스
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스, 힙에 할당 되는 애들
		
		
		// 클래스에 할당되는 것: i. j (클래스의 Static 영역에 할당된다고 한다.)
		// 값 바꿀 수 있는 것 : l, j
		// 바꿀 수 없는 것 : i, k
		
		// k, l은 결국 Finaltest라는 객체가 생성이 되면, 그 안에 생성이 되기에 = 힙영역에 생성이 된다.
		
		
		
	}

}
