package com.ureca.school;

public interface IManager {

	void add(Person p);

	Person[] search();

	Person search(String name);

	void update(Person p);

	void delete(String name);

	void printAll();
}