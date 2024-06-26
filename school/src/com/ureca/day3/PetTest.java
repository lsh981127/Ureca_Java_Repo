package com.ureca.day3;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * 추상 클래스를 활용한 다형성 구현
 * 
 */

class A {
	
}

class B {
	
}

abstract class Pet extends A implements Serializable, Remote {
	private String name;
	
	public Pet(String name) {
		setName(name);
	}
	
	public Pet() {
		setName("펫");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract void speak();
	
}

class Cat extends Pet{
	@Override
	public void speak() {
		System.out.println("야옹");
	}
	
}


class Dog extends Pet{
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
	
}

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet c = new Cat();  // 추상 클래스니까 객체 생성이 불가
		Pet d = new Dog();	// 자식 클래스에 대한 객체를 생성하는 거야
		
		
		
		Pet cf = new Cat(){};
		
		c.speak();
		d.speak();
		System.out.println();
		
		System.out.println(c.getClass().getName());
		System.out.println(cf.getClass().getName());
		
		Pet[] pa = new Pet[2];
		pa[0] = c;
		pa[1] = d;
		
		for(Pet t: pa) t.speak();
		
		
		
	}

}

/**
 * abstract 클래스는 1개라도 abstract 메소드 있으면
 * 
 * 추상 클래스는 절대로 객체 생성이 불가능하다!!
 * 그러니, 추상 클래스를 상속받은 뒤 Override 함으로써 추상 클래스를 이어받고 
 * 다형성을 구현한다!!
 * 
 * 
 * 
 * 
 */

