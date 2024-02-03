package com.example.examples;

import java.util.Objects;

public class Hashcode {
	private String name;
	private int age;

	public Hashcode(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	public static void main(String[] args) {
		Hashcode person1 = new Hashcode("Alice", 25);
		Hashcode person2 = new Hashcode("Bob", 30);

		System.out.println("HashCode for person1: " + person1.hashCode());
		System.out.println("HashCode for person2: " + person2.hashCode());
                System.out.println("person1 equals person2: " + person1.equals(person2));
	}
}
