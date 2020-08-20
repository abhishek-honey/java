package com.java.util.concurrent;

import java.util.concurrent.CompletionException;

public class FeatureCompletionException {

	public static void main(String[] args) {
		Exception exception = new CompletionException("CancellationException occurred! Run Run go Away...",
				new Throwable("CancellationException occurred!"));

		System.out.println(exception);
	}

}
