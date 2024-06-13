package com.ureca.day4;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
class Member {
	private String id;
	private String name;
	private int age;
	
}

public class LombokTest {
	public static void main(String[] args) {
		Member m1 = new Member("winter", "눈송이", 25);
		System.out.println(m1);
		System.out.println(m1.toString());
		System.out.println("-------------------------");
		
		Member m2 = Member.builder()
				.id("w2")
				.name("눈2")
				.age(25)
				.build();
		System.out.println(m2);

	}

}
