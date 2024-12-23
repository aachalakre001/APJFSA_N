package CoreJava;
//WAP in java to Print 1 to 10 & sleep for 500 milisecond using thread  


//Class extending Thread to print numbers from 1 to 10
class PrintNumbers extends Thread {
	// Overriding the run() method of the Thread class
	public void run() {
		try {
			// Loop to print numbers from 1 to 10
			for (int i = 1; i <= 10; i++) {
				System.out.println(i); // Print the current number
				Thread.sleep(500);    // Pause for 500 milliseconds
			}
		} catch (InterruptedException e) {
			// Handle interruption exception
			System.out.println("Thread interrupted: " + e.getMessage());
		}
	}
}

//Main class to execute the program
public class ThreadExamples {
	public static void main(String[] args) {
		// Creating an instance of the PrintNumbers thread
		PrintNumbers thread = new PrintNumbers();
		thread.start(); // Start the thread
	}
}
/*Output:1
2
3
4
5
6
7
8
9
10
 */


