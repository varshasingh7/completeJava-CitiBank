package com.citibank.main;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.citibank.domain.Person;

interface Condition {
	boolean test(Person person);
}

public class PersonMain {
	public static void printAll(Person[] people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person))
				System.out.println(person);
		}
	}
   public static void main(String[] args) {
	   Person person1 = new Person("Vivek", "Gohil", 33);
		Person person2 = new Person("Gurubux", "Gill", 26);
		Person person3 = new Person("Samarth", "Patil", 12);
		Person person4 = new Person("Trupti", "Acharekar", 38);
		
		Person[] persons = { person1, person2, person3, person4 };
		
		Arrays.sort(persons);
		//print all
		System.out.println("printAll");
		Condition noCondition = (p) -> true;
		printAll(persons, noCondition);
		
		System.out.println("begin with G");
		Condition startsWithG = (p) -> {
			if(p.getLastName().startsWith("G")) {
				return true;
			}
			return false;
		};
		printAll(persons, startsWithG);
		
		System.out.println("ends with l");
		Condition endsWithl = (p) -> {
			if(p.getLastName().endsWith("l")) {
				return true;
				
			}
			return false;
		};
		printAll(persons, endsWithl);
}
   
	
	
		
		
		//1.sort the array by lastname
		//2.create a method that print all person of array
		//3.create a method that prints all people that have lastname beggining with G
		//4.create a method that prints all people that have last name ending with l
		

		
//		Arrays.sort(persons);
//		System.out.println("display all in sorted order of last name");
//		display(persons);
//		System.out.println("display last name starts with G");
//		displayAllBiginG(persons);
//		
//		System.out.println("display last name ends with l");
//		displayAllEndsl(persons);
//	}
//	public static void display(Person[] persons) {
//		for (Person person : persons) {
//			System.out.println(person);
//		}
//	}
//	public static void displayAllBiginG(Person[] persons) {
//		for (Person person : persons) {
//			if(person.getLastName().startsWith("G"))
//				System.out.println(person);
//		}
//	}
//	public static void displayAllEndsl(Person[] persons) {
//		for (Person person : persons) {
//			if(person.getLastName().endsWith("l"))
//				System.out.println(person);
//		}
		
	
}
