package com.java.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FeatureCompletionService {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Executor executor = Executors.newFixedThreadPool(5);
		CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

		Callable<String> task = () -> {
			return "hell o world";
		};

		Future<String> submit = completionService.submit(task);
		String futureValue = submit.get();
		System.out.println(futureValue);
	}

}
