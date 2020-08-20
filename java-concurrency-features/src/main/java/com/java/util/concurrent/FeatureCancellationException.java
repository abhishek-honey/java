package com.java.util.concurrent;

import java.util.concurrent.CancellationException;

public class FeatureCancellationException {

	public static void main(String[] args) throws Exception {
		Exception e = new CancellationException("CancellationException occurred! Run Run go Away...");
		throw e;
	}

}
