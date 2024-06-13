package com.ureca.day4;
import java.util.*;

public class MapTest {

	public static void main(String[] args) {
			
		// 비순서
	Map<String, Integer> m= new HashMap<>();
	m.put("이승훈", 1);
	m.put("M2", 2);
	m.put("M3", 3);
	System.out.println(m);
	m.put("이승훈", 4);
	System.out.println(m);
		
		
	  // 저장한 순서대로 System.out.println("---LinkedHashSet--------"); m = new
	  m = new LinkedHashMap<>(); 
	  m.put("이승훈", 1);
	  m.put("M2", 2);
	  m.put("M3", 3);
	  System.out.println(m); 
	  m.put("이승훈", 4);
	  System.out.println(m);
	  
	  
	  
	  // 오름차순 정렬 System.out.println("---TreeSet--------"); 
	  m = new TreeMap<>();
	  m.put("이승훈", 1);
	  m.put("M2", 2);
	  m.put("M3", 3);
	  System.out.println(m); 
	  m.put("이승훈", 4);
	  System.out.println(m);
	  System.out.println("-----출력-----"); 
	  
	  for(Map.Entry<String, Integer> e: m.entrySet()) System.out.println(e);   // key, valye 출력하는
	  
	  for(String key: m.keySet()) System.out.println(m.get(key));	// key 출력하는
	  
	  for(Integer value: m.values()) System.out.println(value);	// value 출력하는
		 
		
		
		
	}

}
