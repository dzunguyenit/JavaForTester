package operators;

public class ArithmeticOperators {

	public static void main(String args[]) {
		int add, subtract, multi, div, mod, increase, decrease;
		int a = 10, b = 15;

		// Phep cong
		add = a + b;
		System.out.println("a + b = " + add);

		// Phep tru
		subtract = a - b;
		System.out.println("a - b = " + subtract);

		// Phep nhan
		multi = a * b;
		System.out.println("a * b = " + multi);

		// Phep chia
		div = b / a;
		System.out.println("b / a = " + div);

		// Phep chia lay du
		mod = b % a;
		System.out.println("b % a = " + mod);

		// Tang 1 don vi
		increase = b++;
		System.out.println("b++ = " + increase);

		// Giam 1 don vi
		decrease = b--;
		System.out.println("b-- = " + decrease);
	}

}
