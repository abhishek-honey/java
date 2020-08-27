package com.java08.functional_interface;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java08.Common;
import com.java08.Humans;

public class SuplierUtility {

	static List<Humans> humans = Common.getHumans();

	static List<String> cities = humans.stream().map(h -> h.getCity() == null ? "NA" : h.getCity())
			.collect(Collectors.toList());
	static List<String> skills = humans.stream().map(h -> h.getSkills() == null ? "NA" : h.getSkills())
			.collect(Collectors.toList());

	public static void main(String[] args) {

		System.out.println("Cities\n---------------------");
		SupplierHumanMade<String> humanMade = () -> getCities();
		for (int i = 0; i < 10; i++)
			System.out.println(humanMade.get());
		
		System.out.println("\nSkills\n---------------------");
		Supplier<String> skillsSupplier = () -> getSkils();
		for (int i = 0; i < 10; i++)
			System.out.println(skillsSupplier.get());
		
		System.out.println("\nDouble Supplier\n---------------------");
		DoubleSupplier supplier = () -> Math.random();
		System.out.println(supplier.getAsDouble());
		

		System.out.println("\n5 random integer between 1 and 10\n---------------------");
		Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);
		Stream.generate(randomNumbersSupp)
		                .limit(5)
		                .forEach(System.out::println);
		
		
	}

	private static String getCities() {
		int index = ThreadLocalRandom.current().nextInt(cities.size());
		return cities.get(index);
	}
	
	private static String getSkils() {
		int index = ThreadLocalRandom.current().nextInt(cities.size());
		return skills.get(index);
	}

}
