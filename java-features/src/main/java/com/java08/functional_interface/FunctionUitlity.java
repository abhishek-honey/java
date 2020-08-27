package com.java08.functional_interface;

import java.util.List;
import java.util.function.Function;

import com.java08.Cat;
import com.java08.Common;
import com.java08.Humans;

public class FunctionUitlity {

	private static final String SEPERATOR = "----------------------";

	public static void main(String[] args) {
		System.out.println("\nAdding 5 dunction: \n--------------");
		Function<Integer, Integer> add5Function = (i) -> add5(i);
		Integer apply = add5Function.apply(20);
		System.out.println(apply);

		Function<Humans, Cat> humanToCat = (h) -> makeCatOutOfHUman(h);

		List<Humans> humans = Common.getHumans();
		System.out.println("\nSample dataset:\n");
		Common.printHumans(humans, 1);
		System.out.println(SEPERATOR);

		System.out.println("\nMutating human: \n--------------");
		Cat apply2 = humanToCat.apply(humans.get(0));
		System.out.println(apply2);

		System.out.println("\nMutating string to upper case: \n--------------");
		FunctionHumanMade<String, String> toUpperCase = (name) -> toUpperCase(name);
		String apply3 = toUpperCase.apply("Honey");
		System.out.println(apply3);
	}

	private static String toUpperCase(String name) {
		return name.toUpperCase();
	}

	private static Cat makeCatOutOfHUman(Humans h) {
		Cat cat = new Cat(h.getFirst_name(), "Tiger", h.getAge());
		return cat;
	}

	private static Integer add5(Integer i) {
		return i + 5;
	}

}
