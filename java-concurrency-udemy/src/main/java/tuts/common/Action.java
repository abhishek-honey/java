package tuts.common;

import java.util.concurrent.TimeUnit;
import java.util.function.ObjIntConsumer;

public class Action {
	public static final ObjIntConsumer<Integer> FOR_LOOP = (i, id) -> {
		System.out.println("<" + id + ">TICK TICK - " + i);
		try {
			TimeUnit.MILLISECONDS.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	};

}
