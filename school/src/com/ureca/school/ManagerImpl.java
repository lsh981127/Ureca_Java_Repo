package com.ureca.school;

import java.util.Arrays;

public class ManagerImpl implements IManager {
	// 1번 : 캡슐화
	private Person[] pa;
	private int index;

	// 2번 : 인스턴스 선언
	private static IManager instance = new ManagerImpl();
	
	
	private ManagerImpl(int size) {
		pa = new Person[size];
	}
	
	// 1
	public ManagerImpl() {
		this(10);
	}
	
	
	// 3번 : 
	public static IManager getInstance() {   // 이떄 왜 static을 ㅆ는거지? 인스턴르로 사용할떄
		return instance;
	}
	 
	@Override
	public void add(Person p) {   // 다 필요없고 이거 1개로 끝
		pa[index++] = p; 
	}
	
	@Override
	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}
	
	@Override
	public Person search(String name) {
		for(int i = 0; i < index; i++) {
			if(pa[i].getName().equals(name)) return pa[i];
		}
		return null;
	}
	
	@Override
	public void update(Person p) {
		for(int i=0; i<index; i++) {
			if(pa[i].getName().equals(p.getName())) {
				pa[i]=p;
				return;
			}
		}
	}
	
	@Override
	public void delete(String name) {
		for(int i = 0; i<index; i++) {
			if(pa[i].getName().equals(name)) {
				// 삭제할때, 제일 뒤에 값이 있는 곳에 넣는것
				index--;
				pa[i]=pa[index];
				pa[index] = null;
				return;
			}
		}
	}
	
	
	@Override
	public void printAll() {
		for(int i=0; i<index; i++) {
			pa[i].printAll();
		}
	}
}
