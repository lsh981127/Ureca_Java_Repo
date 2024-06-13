package com.ureca.day1;
//import java.lang.*;  중요한 패키지들이 이미 있기에 자동으로 import를 해주는 법이야. 명시적으로 import를 해준다.


// 패키지 : 전세계적으로 사람드링 사용할 수 있도록 만들어준 형태
// import 는 그런 패키디즐을 가져올 수 있도록 하는 것


public class InitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		System.out.println(i);   // 초기화를 안해줬기에 컴파일 에러 발생
		
		String i = null;
		String temp = new String("asd");
		String a = "def";
		// 둘다 같다.
		// String은 reference 타입이기에 
		System.out.println(temp.concat(a));
		
		
//		System.out.println(i);
//		System.out.println(i.length());   // Null 인데 왜 조작해? 이게 NullPointerException
		
	}

}

// 자바 기본 언어 공부부터 개빡세게 해야겠다.
