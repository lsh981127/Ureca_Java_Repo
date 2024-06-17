package com.ureca.day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileCopy {

	public static void main(String[] args) {
		// 리소스 사용
		try(
			FileInputStream fis = new FileInputStream("src/com.ureaca.day5.FileCopy.java");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
				
				
			FileOutputStream fos = new FileOutputStream("src/com.ureca.day5.FileCopy.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);			
			PrintWriter pw = new PrintWriter(bw);
		){
			String line = null;
			while ((line = br.readLine()) != null) {
				pw.println(line);
			}
			System.out.println("File Copy");
			
		} catch (IOException e) {			// FileNotFoundException 예외가 발생하지만 IOException이 발생하기에 괜찮다.
			System.out.println("IO 예외 발생");
		}
			
		
	}

}
