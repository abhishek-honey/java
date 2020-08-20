package com.java.util.concurrent;

import java.util.concurrent.BrokenBarrierException;

public class FeatureBrokenBarrierException {

	public static void main(String[] args) throws Exception {
		Exception e = new BrokenBarrierException("BrokenBarrierException occurred! Run Run go Away...");
		throw e;
	}

}
