package com.java.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FeatureCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<String> task = () -> {
			return "hell o world!";
		};

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<String> submit = executorService.submit(task);
		System.out.println(submit.get());
	}

}
