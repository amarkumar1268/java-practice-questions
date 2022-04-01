package com.example.lamda.unit3;

import com.example.lamda.common.Person;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		System.out.println("Using for loop");
		
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");
		
		for (Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("Using lambda for each loop");
		people.forEach(System.out::println);
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("am1",1);
		map.put("am2",2);
		map.put("am3",3);

		map.entrySet().forEach(System.out::println);

		map.forEach((k,v) -> System.out.println("key "+k+" val "+v));
		map.forEach((k,v) -> System.out.println("key "+k+" val "+v));

		for(Map.Entry<String,Integer> entry: map.entrySet()){
             System.out.println(entry);
		}
	}
}
