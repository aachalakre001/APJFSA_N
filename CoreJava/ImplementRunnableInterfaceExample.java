package CoreJava;
//WAP in java to create a class DisplayMessage Which implement the runnable interface contains a run method only
//Class implementing the Runnable interface
class DisplayMessage implements Runnable {
 // Overriding the run() method to define the thread's behavior
 public void run() {
     System.out.println("Hello, this is a message from the DisplayMessage class!");
 }
}

//Main class to execute the program
public class ImplementRunnableInterfaceExample {
 public static void main(String[] args) {
     // Creating an instance of DisplayMessage (Runnable)
     DisplayMessage message = new DisplayMessage();
     
     // Creating a Thread object and passing the Runnable instance
     Thread thread = new Thread(message);
     
     thread.start(); // Start the thread
 }
}

