package com.ureca.day3;

public class OverLoadTest {
	
	// public static = 전역 정적변수(static) 변스
	// protected 는 상속 + 같은 패키지면 가능
	
	public static int add(int x, int y) {
		System.out.println("public int add(int " + x + ", int " + y + ")");
		return x+y;
	}
	
	
	protected static long add(long x, long y) {
		System.out.println("public long add(long " + x + ", long " + y + ")");
		return x+y;
	}
	
	
	static float add(float x, float y) {
		System.out.println("public float add(float " + x + ", float " + y + ")");
		return x+y;
	}
	
	private static double add(double x, double y) {
		System.out.println("public double add(double " + x + ", double " + y + ")");
		return x+y;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadTest o = new OverLoadTest();
		
		/**System.out.println(add(11, 12));  */  // 에러가 발생한다. Main은 Static 이기에 객체를 생성해서 넣어줘야 가틍하다.
		//System.out.println(o.add(11, 12));
		//System.out.println(OverLoadTest.add(11, 12));    // 메소드를 static 해주면 별도의 객체 생성할 필요 없이 호출이 가능하다.
		
		
		System.out.println(add(11, 12));   		// public
		System.out.println(add(11L, 12L));		// protected
		System.out.println(add(1.1F, 1.2F));	// default
		System.out.println(add(1.1, 1.2));		// private
		
		
		/**
		 * 오버로딩은 접근 지정자와 상관이 없다!!. 매개변수 갯수, 타입, 순서가 1개라도 다르면 
		 */

		
		
		
		
		
	}

}
