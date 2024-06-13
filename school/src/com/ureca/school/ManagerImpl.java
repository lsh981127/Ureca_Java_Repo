package com.ureca.school;

import java.io.IOException;
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
	public void add(Person p) throws DuplicatedException {   // 다 필요없고 이거 1개로 끝
		
		try {
			search(p.getName());  // serach 함수는 NotFoundException을 throw한다.
			// search 에서 예외가 없으면 이미 사람이 있다는 거니까 Duplicate예외를 throws를 보내는 거야.
			throw new DuplicatedException(p.getName() + " 중복입니다.");
		} catch (NotFoundException e) {
			pa[index++] = p; 
		} 
		
	}
	
	@Override
	public Person[] search() {
		return Arrays.copyOf(pa, index);
	}
	
	@Override
	public Person search(String name) throws NotFoundException {
		// 오버라이딩의 경우 부모의 예외만 넘어서지 않는다면 갯수는 상관이 없다! 여기서는 부모는 RuntimException 가진다.
		// RuntimeException이 부모고 해당 메소드에서 선언한 예외들은 Runtime 예의의 자식들이야.
		
		for(int i = 0; i < index; i++) {
			if(pa[i].getName().equals(name)) return pa[i];
		}
		// return null;
		throw new NotFoundException(name + " 없습니다."); 
		// 에러 발생하면 

	}
	
	@Override
	public void update(Person p) throws NotFoundException {
		for(int i=0; i<index; i++) {
			if(pa[i].getName().equals(p.getName())) {
				pa[i]=p;
				return;
			}
		}
		throw new NotFoundException(p.getName()+" 없습니다."); 
	}
	
	@Override
	public void delete(String name) throws NotFoundException {
		for(int i = 0; i<index; i++) {
			if(pa[i].getName().equals(name)) {
				// 삭제할때, 제일 뒤에 값이 있는 곳에 넣는것
				index--;
				pa[i]=pa[index];
				pa[index] = null;
				return;
			}
		}
		throw new NotFoundException(name +" 없습니다."); 
	}
	
	
	@Override
	public void printAll() {
		for(int i=0; i<index; i++) {
			pa[i].printAll();
		}
	}
}
