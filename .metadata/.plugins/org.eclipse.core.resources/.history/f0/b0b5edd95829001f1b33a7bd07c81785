package com.ureca.school;

import java.util.*;
public class ManagerMap implements IManager {

	private Map<String, Person> pa;
	
	// ArrayList 는 속도가 느리지만 가변적 => 코테에서 안쓴다
	// 코테에서는 1,2차원 배열로 하는 거고
	// 만약 길이가 안정해져있으면 Arraylist로 하는 게 좋고
	
	
	
	// 2  싱글톤 
	private static IManager instance = new ManagerMap();
	
	// 1
	private ManagerMap(int size) {
		pa = new HashMap<>(size);		
	}
	
	private ManagerMap() {
		this(10);		
	}
	
	
	// 3
	public static IManager getInstance() {
		return instance;
	}
	
	@Override
	public void add(Person p) throws DuplicatedException {
		try {
			search(p.getName());
			throw new DuplicatedException(p.getName() + " 중복입니다.");
		} catch (NotFoundException e) {
			pa.putIfAbsent(p.getName(), p);
		}
		// 없을때만 넣는 메소드
	}

	@Override
	public Person[] search() {
		return pa.values().toArray(new Person[0]);
	}

	@Override
	public Person search(String name) throws NotFoundException {
		Person p = pa.get(name);
		if (p==null) throw new NotFoundException(name +  " 없스빈다.");
		return p;
	}

	@Override
	public void update(Person p) throws NotFoundException {
		search(p.getName());
		pa.put(p.getName(), p);
	}

	@Override
	public void delete(String name) throws NotFoundException {
		search(name);
		pa.remove(name);

	}

	@Override
	public void printAll() {
		for(Person p: pa.values()) System.out.println(p);
		
	}

}
