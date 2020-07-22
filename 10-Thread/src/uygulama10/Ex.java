package uygulama10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Ex {

	public static void main(String[] args) throws Exception {

		ExecutorService e = Executors.newFixedThreadPool(4);

		for (int i = 0; i < 10; i++) {
			e.execute(new Gorevli(i));
		}
		e.shutdown();
		ScheduledExecutorService scex = Executors.newScheduledThreadPool(3);
	}
}
