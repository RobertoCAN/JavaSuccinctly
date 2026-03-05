package sussinclyPart2.p43;

public class Thready implements Runnable {

	private Thread thread;
	private String name;

	public Thready(String name) {
		this.name = name;
		System.out.println("Create thread: " + name);
	}

	// init and start thread method
	public void initThread() {
		System.out.println("Initializing thread: " + name);
		thread = new Thread(this, name);
		thread.start();
	}

	// overridden run method:
	public void run() {
		System.out.println("Running thread: " + name);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + name + " counter " + i);
		}
		try {
			//wait for 1 second
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
