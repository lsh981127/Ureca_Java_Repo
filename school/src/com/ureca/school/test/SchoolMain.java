package com.ureca.school.test;

import com.ureca.school.*;

public class SchoolMain {

	public static void main(String[] args) {
//		IManager m = ManagerImpl.getInstance();  
		IManager m = ManagerList.getInstance();
//		IManager m = ManagerMap.getInstance();
		// 어차피 여기서는 m 그냥 인스턴스 받아서 쓰기에 신경쓰지 않는다.

		

		
		try {
			m.add(new Student("학생", 20, 24));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			m.add(new Teacher("선생", 15, "자바"));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			m.add(new Employee("노동자",30, 'a'));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			m.add(new Teacher("일강사",20, "자바"));
		} catch (DuplicatedException e) {
			System.out.println(e.getMessage());
		}
		
		
		// 각각 사람 추가하는 걸 따로따로 동작하도록 설계를 하는거고
		// 만약 1개라도 안되면 다 묶에서 try catch 해두면 되는 거지!
		
		m.printAll();
		System.out.println(" ");
		
		
		Person p = null;
		try {
			p = m.search("일강사1");
			System.out.println(p);
			System.out.println();
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		/**
		 * 어차피, try catch 로 묶을때, 선언부나 실행부나 어차피 예외 걸리면 실행 안될거고 실행되면 그냥 한번에 처리되도록 묶어두는 게 편하긴하네
		 */
		
		try {
			p = new Teacher("일강사", 20, "자바");
			m.add(p);
			for(Person t: m.search()) t.printAll();	
			System.out.println();
		} catch (DuplicatedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			m.delete("일강사");
			m.printAll();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
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
