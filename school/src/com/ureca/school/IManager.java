package com.ureca.school;


public interface IManager {

	void add(Person p) throws DuplicatedException;

	Person[] search();

	Person search(String name) throws NotFoundException;
	
	void update(Person p) throws NotFoundException;

	void delete(String name) throws NotFoundException;

	void printAll();
}






/**
*	인터페이스 종류
*	1. public 상수 필드
* 	2. public 추상 메소드
* 	3. public 디폴트 메소드
* 	4. public 정적 메소드
* 	5. private 메소드
* 	6. private 정적 메소드
*
*/
