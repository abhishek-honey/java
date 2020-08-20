package com.java.util.concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

public class FeatureBlockingDeque {
	private static BlockingDeque<Long> blockingDeque = new LinkedBlockingDeque<>();
	private static AtomicLong atomicLong = new AtomicLong(0);
	private static ExecutorService executor = Executors.newFixedThreadPool(20);

	public static void main(String[] args) throws InterruptedException {
		System.out.println("***************\nUsing Runnable");
		usingRunnable();

		Thread.sleep(1000);

		System.out.println("\n***************\nUsing Callable");
		usingCallable();
	}

	private static void usingCallable() {
		Callable<Boolean> offerCallable = () -> {
			return blockingDeque.offer(atomicLong.getAndIncrement());
		};

		Callable<Long> pollCallable = blockingDeque::poll;

		for (int i = 0; i < 100; i++) {
			Future<Boolean> offer = executor.submit(offerCallable);
			Future<Long> poll = executor.submit(pollCallable);
			try {
				System.out.println("Offering at " + System.nanoTime() + " : " + offer.get());
				System.out.println("Polling at " + System.nanoTime() + " : " + poll.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}

		executor.shutdown();
	}

	private static void usingRunnable() {
		Runnable offerRunnable = () -> System.out
				.println(Thread.currentThread().getName() + "\ttimestamp:\t" + System.nanoTime() + " " + " Offering: "
						+ blockingDeque.offer(atomicLong.getAndIncrement()) + " " + atomicLong);

		Runnable pollRunnable = () -> System.out.println(Thread.currentThread().getName() + "\t timestamp:\t"
				+ System.nanoTime() + " " + " Polling: " + blockingDeque.poll());

		for (int i = 0; i < 100; i++) {
			String offerThread = "Thread Offer: " + i + " -> ";
			String pollThread = "Thread Poll: " + i + " <- ";
			Thread t1 = new Thread(offerRunnable, offerThread);
			Thread t2 = new Thread(pollRunnable, pollThread);
			t1.start();
			t2.start();
		}
	}

}
