package com.ureca.school;

public sealed abstract class Person permits Student, Teacher, Employee{   
	// sealed 아무나 상속하지 마라라는 뜻, permits 이 클래스들 제외하고는 상속하지 마라라는 뜻
	
	// non-sealed : 아무나 쓸 수 있다.
	
	// sealed 는 즉, final 아무도 못쓴다 + 상속 못한다 + 못 고친다
	// 아무도 상속을 받을 수 없으니 변경하지 말고 이대로 사용해라
	
	// 메소드나 변수에 final 붙이는 게, 절대 변경하지 마라 라는 뜻

	protected String name = "아무개";
	protected int age;

	public Person(String name, int age) {
		// super(); 컴파일러가 알아서 super를 넣어버령
		setName(name);
		setAge(age);
	}
	
	public Person() {
		setName("무이름");
		setAge(1);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		checkAge(age);
	}

	private void checkAge(int age) {
		if (age < 1 || age > 99){
			System.out.println("Invalid Age(1 ~ 99)");
			System.exit(0);
		}else {
			this.age = age;
		}
	}
	
	// 이렇게 하면 된다!!  toString 활용법

	@Override
	public String toString() {
		return getName() + "\t" + getAge() + "\t";
	}
	
	public void printAll() {
		// 이 3개 전부 동일한 결과를 출력한다!!
		
//		System.out.println(this.toString());
		System.out.println(this);
//		System.out.println(toString());
	}
	
}