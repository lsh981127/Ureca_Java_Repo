package com.ureca.day3;
import java.io.Serializable;

interface IA {
	
}

interface IB {
	
}

interface IFlyer extends IA, IB{
	public int i = 11;	// 이렇게 선언해서 컴파일러가 public static final 이 자동으로 생성됨
	int j = 12;			// 이것도 public static final int 가 붙는다.
	
	
	void fly();  		// 이렇게 선언하더라도 public abstract 가 앞에 자동으로 생성된다.
	
}


class Airplane implements IFlyer {

	@Override
	public void fly() {
		System.out.println("비행기 날아");
	}
	
	
}


class Bird implements IFlyer {

	@Override
	public void fly() {
		System.out.println("새가 날아");
	}
	
	
}

class Duck implements IFlyer {

	@Override
	public void fly() {
		System.out.println("오리 날아");
	}
	
	
}

public class FlyerTest {
	public static void main(String[] args) {
		
		/* IFlyer f = new IFlyer(); */ 		// interface는 객체 못 생성하지
		Serializable s = new Serializable(){};
		// interface 객체 못만드는데 이거 어떻게 만들었는데??
		// 바로 {}를 붙여서. Serializable에 대한 ?? 클래스를 만들어서??
		System.out.println(s); 
		/**
		 * 실행 결과
		 * com.ureca.day3.FlyerTest$1@75a1cd57
		 * $1 : anonymous class 
		 */
		
		IFlyer a = new Airplane();
		IFlyer b = new Bird();
		IFlyer d = new Duck();

		a.fly();
		b.fly();
		d.fly();
		System.out.println();

		IFlyer[] fa = new IFlyer[3];
		fa[0] = a;
		fa[1] = b;
		fa[2] = d;
		
		for(IFlyer t: fa) t.fly();
			
		
		// IFlyer라는 인터페이스를 사용해서 생성 및 사용하는 거야
		
		
		
	}

}
