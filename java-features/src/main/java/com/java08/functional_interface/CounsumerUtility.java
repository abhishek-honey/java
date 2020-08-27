package com.java08.functional_interface;

import java.util.List;
import java.util.function.Consumer;

import com.java08.Common;
import com.java08.Humans;

public class CounsumerUtility {

	private static final String SEPERATOR = "----------------------";

	public static void main(String[] args) {
		System.out.println("Do something with integer i:\n--------------");
		Consumer<Integer> consumer = (i) -> doSomethingWithInteger(i);
		consumer.accept(10);

		System.out.println("Printing string in uppercase:\n--------------");
		CounsumerHumanMade<String> counsumerHumanMade = name -> System.out.println(name.toUpperCase());
		counsumerHumanMade.accept("Honey");

		List<Humans> humans = Common.getHumans();
		System.out.println("Sample dataset:\n");
		Common.printHumans(humans, 1);
		System.out.println(SEPERATOR);

		System.out.println("Mutating human: i\n--------------");
		Humans human = humans.get(0);
		Consumer<Humans> changeCity = (h) -> changeCityToDelhi(h);
		changeCity.accept(human);
		System.out.println(human);

	}

	private static void doSomethingWithInteger(Integer i) {
		System.out.println(i);
	}

	private static void changeCityToDelhi(Humans human) {
		human.setCity("Delhi");
	}

}
