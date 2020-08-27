package com.java08;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Common {
	private static final String JSON_FILE = "/Users/apple/code/github/java/java-features/resources/humans.json";

	public static List<Humans> getHumans() {
		try (Reader reader = Files.newBufferedReader(Paths.get(JSON_FILE));) {
			return new Gson().fromJson(reader, new TypeToken<List<Humans>>() {
			}.getType());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ArrayList<>();
	}

	public static void printHumans(List<Humans> humans, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(humans.get(i));
		}
	}

}
