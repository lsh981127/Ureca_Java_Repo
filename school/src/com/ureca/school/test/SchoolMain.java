package com.ureca.school.test;

import com.ureca.school.*;

public class SchoolMain {

	public static void main(String[] args) {
		IManager m = ManagerImpl.getInstance();  
		m.add(new Student("학생", 20, 24));
		m.add(new Teacher("선생", 15, "자바"));
		m.add(new Employee("노동자",30, 'a'));
		m.printAll();
		System.out.println(" ");
		
		
		Person p = m.search("선생");
		System.out.println(p);
		System.out.println();
		
		p = new Student("일강사", 20, 202402);
		m.update(p);
		for(Person t: m.search()) t.printAll();	
		System.out.println();
		
		m.delete("일강사");
		m.printAll();
		
		
		/*
		 * Person p = new Student("홍ㄱ", 20, 202051); // 02141 // 202051
		 * System.out.println(p.toString());
		 */

		
		
		
		/*
		 * 다형성의 5가지 특징? 활용도? 의미? 인듯
		 */

		// 5. Overriding(재정의) : 구현부를 구현 및 재구현하는 것
		//, 이와 유사한게 Overloading(중복 정의)
		// override 한 메소드는 @override 있으면 되긴하는데 이제는 안해도 돼

		/**
		 * 부모한테 받은 것들을 자식이 Refactoring 시키는 것
		 * 
		 * Person p = new Student("asd", 1, 123); p.printAll();
		 * 
		 * "Person의 printAll 함수" public void printAll() { System.out.print(getName() +
		 * "\t" + getAge() + "\t"); }
		 * 
		 * "Student의 printAll 함수"
		 * 
		 * @Override public void printAll() { super.printAll();
		 *           System.out.print(getName() + "\t" + getAge() + "\t"); }
		 * 
		 * 
		 * 
		 * 
		 */

		// 4. 리턴 타입(Polymorphic Return type)
		/**
		 * Person get() {
		 * 
		 * return Student(); // 고로 상속을 했기에 이것도 가능하다 }
		 * 
		 * 
		 * int get() {
		 * 
		 * return 'A'; // return 타입이 int지만 char return도 가능하다. }
		 * 
		 * 
		 * 
		 */

		// 3. 다형성 특징을 활용한 파라미터
		/**
		 * 
		 * void set(Person p) {
		 * 
		 * } void set(int i) {} set('A'); set(new Person("gasd", 20, 123));
		 */

		// 다형성 배열
		/*
		 * int[] ia = new int[3]; ia[0] ='A';
		 * 
		 * Person[] pa = new Person[3]; pa[0] = new Student("홍길동", 20, 202401); pa[1] =
		 * new Teacher("일강사", 30, "자바"); pa[2] = new Employee("일직원", 25, 'a');
		 * for(Person p:pa) p.printAll();
		 */

		// 1 다형성
		/*
		 * // 다형성 int i = 'a'; // int 가 char 보다 크니까 자동으로 상속?이 된다. // 이걸 다형성이라고 부른다. 자동이도
		 * 대입이 되는 것
		 * 
		 * 
		 * Person p = new Student("Sean", 20, 579543); p.setName("SeanLee"); // 가능! => p
		 * 객체는 Person 이니까 // p.setStuId(202488); // 불가능! => p 객체가 Student가 아니니까!
		 * p.printAll(); // 가능, sub <- override <- 상속
		 * 
		 * 
		 * if (p instanceof Student) { Student s = (Student) p; s.setStuId(202477); }
		 * 
		 * System.out.println(p instanceof Object); System.out.println(p instanceof
		 * Person); System.out.println(p instanceof Student);
		 */

	}

}
