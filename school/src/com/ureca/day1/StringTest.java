package com.ureca.day1;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// '' : 이건 char 타입, 그리고 이건 1글자만 들어갈 수 있다!!
		// "" : string 타입
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1==s2);
		// 각 객체의 주소값이 같은지 비교하는 거야
		// s1, s2는 새로운 객체를 만드는게 아니라 기존 객체를 그대로 사용하기에 같은 주소값을 가진다
		
		
		String t1 = new String("홍길동");
		String t2 = new String("홍길동");
		
		System.out.println(t1==s1);    // t1은 새로운 객체를 만들었기에 주소값이 다르다!
		
		System.out.println(t1==t2);    // 서로 다른 객체니까, 주소값이 다르지
		
		
		System.out.println(s1.equals(s2));
		// equals : 각 객체의 주소값의 값을 비교하는 것
		
		
		StringBuilder sb = new StringBuilder("홍길동");   // char 의 배열이야
		sb.append(sb);
		System.out.println(s1);
		System.out.println(sb.toString());
		
		String a = """
				{
					"id": "winter",
					"name": "눈송이",
					"age" : 20
					
				}
				""";
		System.out.println(a);
	}

}