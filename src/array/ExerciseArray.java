package array;

public class ExerciseArray {
	public static void main(String args[]) {
		int[] myArray = { 1, 2, 5, 4, 0 };

		int sumOdd = 0;

		for (int i = 0; i < myArray.length; i++) {
			if (i % 2 != 0) {
				sumOdd += myArray[i];
			}
		}
		System.out.println("Sum Odd = " + sumOdd);
	}
}
