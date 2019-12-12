import java.util.Random;

public class Processor {
	
	static int x = 0;
	
	public int increment() {
		Random random = new Random();
		int n = random.nextInt(1000000);
		synchronized(this) {
			for (int i = 0; i < n; i++) {
				x++;
			}
		}
		return n;
	}
	
	public void print() {
	
		synchronized (this) {
			System.out.println("x = " + x);
		}
	
	}

}
