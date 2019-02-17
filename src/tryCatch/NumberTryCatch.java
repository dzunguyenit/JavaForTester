package tryCatch;

public class NumberTryCatch {
	public static void main(String args[]) {
		try {
			int a = 10, b = 0;
			int div = a / b;
			System.out.println("Result = " + div);
		} catch (Exception e) {
			System.out.println("Exception thrown  :" + e);
		}
	}
}
