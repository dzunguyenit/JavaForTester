package string;

public class ConvertIntToString {
	public static void main(String args[]) {
		String text1 = "I Have 100$";
		String myMoney = text1.substring(7, 10);
		System.out.println("My money = " + myMoney);

		String text2 = "She give me 50$";
		String herMoney = text2.substring(12, 14);
		System.out.println("Her money = " + herMoney);

		int sumMoney = Integer.parseInt(myMoney) + Integer.parseInt(herMoney);
		System.out.println("Sum money = " + sumMoney);

	}

}
