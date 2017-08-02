/*
 * Creating a class DaemonTest and extending it with Runnable interface
 */
public class DaemonTest implements Runnable {
	// run method
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("thread working is daemon ");
		} else {
			System.out.println("user thread is working");
		}
	}
}
