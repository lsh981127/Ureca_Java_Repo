package com.ureca.school;

public non-sealed class Student extends Person{
	private int stuId;
	
	// 내부 값이 바뀌어야한다면 Validation 한 뒤 Setter로 바꾸는 것
	// 값을 가져갈때는 Getter
	
	// 생성자가 없으면 컴파일러가 이런 default 생성자를 알아서 생성하고 진행
	// Default 생성자 대신 다른 생성자가 있으면 default 생성자를 만들어주지 않는 이상 안된다.
	
	public Student(String name, int age, int stuId) {
		// 부모 생성자에서 알아서 필드 검사 및 초기화 진행하라고
		// Super에서 알아서 처리하도록 내버려두기
		super(name, age);
		setStuId(stuId);
	}
	
	// Super 가 꼭 먼저 와야한다!!
	// 또한, Super와 this를 같이 쓰면 안된다.
	
	public Student() {	
		this("바보",98, 20241225);
	}
	
	public Student(String name, int stuId) {
		this(name, 99,stuId);
	}
	
	public Student(String name) {
		this(name, 99,0000);
	}
	
	/*
	 * public Student(String name, int age, int stuId) { // 생성자: 초기화 작업을 담당해준다. //
	 * 묻지마 코딩인 파트
	 * 
	 * // this.name = name; 이렇게 하면 Validation을 뛰어넘게된다. // 이렇게 하면 성능은 떨어질 수 있지만 캡슐화는
	 * 지킨다! setName(name);
	 * 
	 * // this.age = age; setAge(age);
	 * 
	 * // this.stuId = stuId; setStuId(stuId); }
	 */

	// 여러 경우에 대해 생성자를 다양하게 만드는 것
	// => 생성자 Overloading

	// 매개변수 다 있는 생성자 + default + 필수 항목인 변수를 포함한 생성자 1개
	// 이정도 생성자만 만들어둔다.


	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	
	
	// 접근 지정자, default는 package에서만 사용 가능
	// public protected deault(package) private
	// 4가지 있음
	
	
	// 캡슐화 순서
	// 1. 클래스를 private하게 만듦으로서 캡슐화 진행, 거의 몽땅 다 필드나 ㅁ메소드를 private
	// 2. public한 부분들을 최소화하기
	// 3. validation 하기. 절대 잘못된 값이 안들어가도록 설정할 것
	// 코드 재사용성, 유지보수성을 향상시키는 것이 목적
	
	@Override
	public String toString() {
		return super.toString() + getStuId();
	}
	
	@Override
	public void printAll() {
		// 기본적으로 this. 은 내장되어 있음. 없어도 이미 this인것을 알긴 한다.
		super.printAll();

	}

	
}
