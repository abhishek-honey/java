package tut1.threads.running;

import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FifthTechnique {
	private static final int NUM_OF_ITERATION = 5;
	private static int id;

	private static final IntConsumer iterateForLoop = i -> {
		System.out.println("<" + id + ">TICK TICK - " + i);
		try {
			TimeUnit.MILLISECONDS.sleep(250);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	};

	public static void main(String[] args) {
		System.out.println("Main thread starts here...");

		Thread t = new Thread(() -> IntStream.rangeClosed(1, NUM_OF_ITERATION).forEach(iterateForLoop));

		t.start();

		System.out.println("Main thread ends here...");
	}
}
