package com.java08;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(stream.map(String::valueOf).collect(Collectors.joining(",")));

		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> streamOfArray = Arrays.stream(arr);
		System.out.println(streamOfArray.collect(Collectors.joining(",")));

		arr = new String[] { "a", "b", "c", "d" };
		Stream<String> streamOfArray_1 = Stream.of(arr);
		System.out.println(streamOfArray_1.collect(Collectors.joining(",")));

		Stream<String> emptyStream = Stream.empty();
		System.out.println(emptyStream.collect(Collectors.joining(",")));

		Stream.Builder<String> builder = Stream.builder();
		Stream<String> streamUsingBuilder = builder.add("a").add("b").add("c").add("d").add("e").build();
		System.out.println(streamUsingBuilder.collect(Collectors.joining(",")));

		Stream.iterate(1, (Integer n) -> n * n).limit(5).forEach(System.out::println);

		Stream.generate(Math::random).limit(10).forEach(System.out::println);

		List<String> list = Arrays.asList("Delhi", "Vegas", "Paris", "Mumbai", "Dubai");
		Pattern p = Pattern.compile("^D");
		list.stream().filter(p.asPredicate()).forEach(System.out::println);

	}

}
