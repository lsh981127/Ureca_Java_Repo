package com.ureca.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res/input.txt"));
		// 아예 input 파일을 만듦으로써 반복해서 넣기 편해
		// 단, 제출할대는 해당 부분 주석처리해서 넣어야한다.
		
		
		
		Scanner sc = new Scanner(System.in);
		
//			String name = sc.next(); 
//			int age = sc.nextInt();
//			double pi = sc.nextDouble();
//			char ch = sc.next().charAt(0);  // string으로 읽고 제일 앞 index를 가져오는 거야
//			System.out.println(name + ' ' + age + ' ' + pi + ' ' + ch);
		
		
		String line = sc.nextLine();    // 그냥 한 줄 다 읽는 거야
		String[] sa = line.split(" ");  // 공백 문자로 짜르기
		String name = sa[0];
		int age = Integer.parseInt(sa[1]);
		double pi = Double.parseDouble(sa[2]);
		char ch = sa[3].charAt(0);
		System.out.println(name + ' ' + age + ' ' + pi + ' ' + ch);
		sc.close();
	}

}