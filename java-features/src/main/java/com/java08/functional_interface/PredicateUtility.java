package com.java08.functional_interface;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java08.Common;
import com.java08.Humans;

public class PredicateUtility {

	private static final String SEPERATOR = "----------------------";
	
	public static void main(String[] args) throws IOException {
		PredicateHumanMade<Integer> lessThan100 = i -> (i<100);
		System.out.println(lessThan100.test(7));
		
		List<Humans> humans = Common.getHumans();
		System.out.println("Sample dataset:\n");
		Common.printHumans(humans, 2);
		System.out.println(SEPERATOR);
		
		PredicateHumanMade<Integer> ageLessThan10 = i -> (i < 10);
		
		long count = humans.stream()
				.filter(h -> ageLessThan10.test(h.getAge()))
				.count();
		System.out.println(count);
		
		
		Predicate<String> cityStartsWithA = city -> city.startsWith("A");
		List<String> cityNameStartsWithA = humans.stream()
				.filter(h -> cityStartsWithA.test(h.getCity()))
				.map(Humans::getCity)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(cityNameStartsWithA);
		
		Predicate<String> cityStartsWithAFiveLetters = city -> (city.startsWith("A") && city.length()==5);
		List<String> cityNameStartsWithAFiveLetters = humans.stream()
				.filter(h -> cityStartsWithAFiveLetters.test(h.getCity()))
				.map(Humans::getCity)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(cityNameStartsWithAFiveLetters);
		
	}
}
