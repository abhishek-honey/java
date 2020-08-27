package tuts.common;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class LoopTaskA implements Runnable {

	private static AtomicInteger count = new AtomicInteger(0);
	private static final int NUM_OF_ITERATION = 10;
	private int id;

	private final IntConsumer iterateForLoop = i -> {
		System.out.println("<" + id + ">TICK TICK - " + i);

		try {
			TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	};

	@Override
	public void run() {
		System.out.println("##### <TASK-" + id + "> STARTING #####");

		IntStream.rangeClosed(1, NUM_OF_ITERATION).forEach(iterateForLoop);

		System.out.println("***** <TASK-" + id + "> COMPLETED *****");
	}

	public LoopTaskA() {
		this.id = count.incrementAndGet();
	}
}