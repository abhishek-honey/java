package com.java08;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utility {
	private static final String SEPERATOR = "----------------------";

	public static void main(String[] args) throws IOException {
		List<Humans> humans = Common.getHumans();
		System.out.println("Sample dataset:\n");
		Common.printHumans(humans, 7);
		System.out.println(SEPERATOR);

		sortByAgeFirstAttempt(humans);

		humans = Common.getHumans();
		sortByAgeSecondAttempt(humans);

		humans = Common.getHumans();
		sortByAgeThirdAttempt(humans);

		sortByAgeFourthAttempt(humans);

		sortByAgeFifthAttempt(humans);

		sortByAgeMapExample(humans);

		getSexRatio(humans);

		getAgeStat(humans);

	}

	private static void getAgeStat(List<Humans> humans) {
		System.out.println("Stat:\n");
		IntSummaryStatistics statistics = humans.stream()
				.mapToInt(Humans::getAge)
				.summaryStatistics();

		System.out.println(statistics);
		System.out.println(SEPERATOR);
	}

	private static void getSexRatio(List<Humans> humans) {
		System.out.println("Sex Ratio:\n");
		Map<String, Long> humansByGender = humans.stream()
				.collect(Collectors.groupingBy(h -> (h.getGender() == null ? "NA" : h.getGender()), Collectors.counting()));
		
		System.out.println(humansByGender);
		System.out.println(SEPERATOR);
	}

	private static void sortByAgeMapExample(List<Humans> humans) {
		System.out.println("Map example:\n");
		humans.stream()
			.sorted(Comparator.comparing(Humans::getAge))
			.map(h -> h.getAge() + " " + h.getFirst_name())
			.limit(10).forEach(System.out::println);
		System.out.println(SEPERATOR);
	}

	private static void sortByAgeFifthAttempt(List<Humans> humans) {
		System.out.println("Fifth and final Attempt: Using stream and inline comparator:\n");
		humans.stream()
			.sorted(Comparator.comparing(Humans::getAge))
			.limit(10).forEach(System.out::println);
		System.out.println(SEPERATOR);
	}

	private static void sortByAgeFourthAttempt(List<Humans> humans) {
		System.out.println("Fourth Attempt: Using stream and comparator:\n");
		Comparator<Humans> ageComparatorLambdaTypeInference = (h1, h2) -> {
			return h1.getAge().compareTo(h2.getAge());
		};
		
		Stream<Humans> sortedHumanStream = humans.stream()
												.sorted(ageComparatorLambdaTypeInference);

		List<Humans> collectedFirst10Humans = sortedHumanStream.limit(10)
															.collect(Collectors.toList());
		Common.printHumans(collectedFirst10Humans, 7);
		System.out.println(SEPERATOR);
	}

	private static void sortByAgeThirdAttempt(List<Humans> humans) {
		System.out.println("Third Attempt: Using Lambda with type reference:\n");
		Comparator<Humans> ageComparatorLambdaTypeInference = (h1, h2) -> {
			return h1.getAge().compareTo(h2.getAge());
		};

		Collections.sort(humans, ageComparatorLambdaTypeInference);
		Common.printHumans(humans, 7);
		System.out.println(SEPERATOR);
	}

	private static void sortByAgeSecondAttempt(List<Humans> humans) {
		System.out.println("Second Attempt: Using Lambda without type reference:\n");
		Comparator<Humans> ageComparatorLambda = (Humans h1, Humans h2) -> {
			return h1.getAge().compareTo(h2.getAge());
		};

		Collections.sort(humans, ageComparatorLambda);
		Common.printHumans(humans, 7);
		System.out.println();
	}

	private static void sortByAgeFirstAttempt(List<Humans> humans) {
		System.out.println("First Attempt: Using comparator:\n");
		
		Comparator<Humans> ageComparator = new Comparator<>() {
			@Override
			public int compare(Humans h1, Humans h2) {
				return h1.getAge().compareTo(h2.getAge());
			}
		};

		Collections.sort(humans, ageComparator);
		Common.printHumans(humans, 7);
		System.out.println(SEPERATOR);
	}
}
