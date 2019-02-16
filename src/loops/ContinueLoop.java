package loops;

public class ContinueLoop {

	public static void main(String args[]) {
		for (int x = 10; x < 15; x++) {
			if (x == 12)
				continue;
			System.out.println("value of x : " + x);
		}
	}
}
