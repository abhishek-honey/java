package tut1.threads.running;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FourthTechnique {

	public static void main(String[] args) {
		System.out.println("Main thread starts here...");

		new Thread(new FourthTask()).start();
		Thread t = new Thread(new FourthTask());
		t.start();

		System.out.println("Main thread ends here...");
	}
}

class FourthTask implements Runnable {

	private static AtomicInteger count = new AtomicInteger(0);
	private static final int NUM_OF_ITERATION = 5;
	private int id;

	private final IntConsumer iterateForLoop = i -> {
		System.out.println("<" + id + ">TICK TICK - " + i);
		try {
			TimeUnit.MILLISECONDS.sleep(250);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	};

	@Override
	public void run() {
		IntStream.rangeClosed(1, NUM_OF_ITERATION).forEach(iterateForLoop);
	}

	public FourthTask() {
		this.id = count.incrementAndGet();
	}
}