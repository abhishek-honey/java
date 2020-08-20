package com.java.util.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class FeatureCompletionStage {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletionStage<Integer> task = CompletableFuture.supplyAsync(() -> 10);
		CompletionStage<Integer> squareTask = task.thenApply(FeatureCompletionStage::square);

		Integer integer = squareTask.toCompletableFuture().get();
		System.out.println(integer);
	}

	private static int square(Integer x) {
		return x * x;
	}

}
