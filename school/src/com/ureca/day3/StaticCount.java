package com.ureca.day3;



class Count {
	public static int si;
	public int pi;
	
	
	
	static {   	// static 블럭
		si = 1;
		System.out.println("static{1} " + si);
	}
	
	
	public static int getSi(){   	// static 블럭
		return si;
	}
	
	static {   	// static 블럭
		si = 2;
		System.out.println("static{2} " + si);
	}
	
	
}

public class StaticCount {
	
	static {
		System.out.println("main보다 먼저 실행된다. 이 static이");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 실행");
		System.out.println(Count.si);     // Count를 호출하면 Count 클래스의 static부터 찾고 실행한다!
		System.out.println(Count.getSi());
		
		// 지금까지는 힙이나 스택에 아무것도 없는 상태
		// 이게 Count 객체 만들고 해야 객체 지향적으로 진행해야 쓸 수 있다!
		System.out.println("----------c1----------");
		Count c1 = new Count();
		c1.si++;						// 이미 앞서 static에서 si는 2까지 되었기에 상관없다.
		System.out.println(c1.pi);		// 인스턴스 변수 : 객체가 선언이 되어야 사용이 가능한 변수
		System.out.println(c1.si);		// 
		System.out.println(c1.getSi());
		
		System.out.println("--------c2-------------");
		Count c2 = new Count();
		c2.si++;
		System.out.println(c2.pi);
		System.out.println(c2.si);
		System.out.println(c2.getSi());

		
		
		
	}

}
