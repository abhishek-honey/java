package com.java.util.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FeatureCompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Long> completableFuture = new CompletableFuture<>();

		try {
			System.out.println(completableFuture.get(1000, TimeUnit.MILLISECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

		System.out.println("Manually complete a Future");
		completableFuture.complete(10L);

		System.out.println(completableFuture.get());
		System.out.println(completableFuture.thenApply(t -> t + 10).get());
	}

}
