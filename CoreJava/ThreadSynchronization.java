package CoreJava;
//Thread to calculate the average of the first 10 numbers
class AverageThread extends Thread {
	private final Object lock;

	// Constructor to pass the shared lock
	public AverageThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			double average = sum / 10.0;
			System.out.println("Average of first 10 numbers: " + average);

			// Notify the other thread and wait for its turn
			lock.notify();
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//Thread to calculate and print the square of numbers in an array
class SquareThread extends Thread {
	private final Object lock;
	private final int[] arr;

	// Constructor to pass the shared lock and array
	public SquareThread(Object lock, int[] arr) {
		this.lock = lock;
		this.arr = arr;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for (int num : arr) {
				System.out.println("Square of " + num + " is: " + (num * num));
			}

			// Notify the other thread after completing execution
			lock.notify();
		}
	}
}

public class ThreadSynchronization {
	public static void main(String[] args) {
		// Shared lock for synchronizing threads
		Object lock = new Object();

		// Array containing numbers for square calculation
		int[] arr = {1, 20, 50, 15, 30};

		// Creating threads
		AverageThread avgThread = new AverageThread(lock);
		SquareThread squareThread = new SquareThread(lock, arr);

		// Starting threads
		avgThread.start();
		squareThread.start();
	}
}
/*output:Average of first 10 numbers: 5.5
Square of 1 is: 1
Square of 20 is: 400
Square of 50 is: 2500
Square of 15 is: 225
Square of 30 is: 900
 */