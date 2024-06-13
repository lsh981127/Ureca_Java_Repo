package com.ureca.day4;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("AA BB CC", " ");
		System.out.println(st.countTokens() + " " + st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.println(st.countTokens() + " " + st.nextToken());
		}
		
		System.out.println(st.countTokens());
		System.out.println(" ");
		System.out.println("------------------------------------------- ");
		
		st= new StringTokenizer("AA BB CC", " ");
		int cnt = st.countTokens();
		for (int i = 0; i < cnt; i++) {
			System.out.println(st.countTokens() + " " + st.nextToken());
		}
	}

}
