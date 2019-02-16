package loops;

public class BreakLoop {

	public static void main(String args[]) {
		for (int x = 10; x < 15; x++) {
			if (x == 12)
				break;
			System.out.println("value of x : " + x);
		}
	}
}
