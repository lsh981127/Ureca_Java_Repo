package com.ureca.school.test;

import com.ureca.school.Employee;
import com.ureca.school.Person;
import com.ureca.school.Student;
import com.ureca.school.Teacher;

public class SchoolTest extends Student{

	public static void main(String[] args) {
		
		
		Student s = new Student("Sean", 20, 20240611);
		s.printAll();

		Student s1 = new Student("Harry", 18, 19981127);
		s1.printAll();

		Student s2 = new Student("Potter", 19, 2020419);
		s2.printAll();
		System.out.println();
		
		Teacher t = new Teacher("Teach", 30, "Java");
		Employee e = new Employee("Work", 30, 'M');
		
		
		// 이제 이런게 가능하다!!!
		
		Person p = null;
			
	
		p = new Student("Sean", 20, 20240611);
		p.printAll();
		
		p = new Student("Harry", 18, 19981127);
		p.printAll();
		
		p = new Student("Potter", 19, 2020419);
		p.printAll();
		
		p = new Teacher("Teach", 30, "Java");
		p.printAll();
		
		p = new Employee("Work", 30, 'M');
		p.printAll();
		
		
		
		t.printAll();
		e.printAll();
		
	}

}




// 상속 - 일반화/구체화 이렇게 나눠진다.
// 1곳만 고치기 위해 상속을 쓴다

// Teacher, Employee. Student 등 전부 Person을 상속받으면 Person만 고치면 된다.

// 여기서 Person으 