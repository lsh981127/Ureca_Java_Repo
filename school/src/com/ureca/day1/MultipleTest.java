package com.ureca.day1;

import java.util.Scanner;

public class MultipleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단(2 ~ 9)? ");
		int num = sc.nextInt();
		int i = 1;
		order : while (i <= 9) {
			for (int j = 2; j <= num; j++) {
				System.out.printf("%d X %d = %-3d\t", j, i, j * i);
				if (i == 5 && j == 3 ) break order;
			}
			System.out.println("");
					// i == 7 검사하는 걸 앞에 넣어주는 게 이득
			i++;
		}
		System.out.println("");
		System.out.println("끝");
		sc.close();
		
	}

}


