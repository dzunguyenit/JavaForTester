package decisionMaking;

public class SwitchCaseStatement {
	public static void main(String args[]) {
		int degree = 14;

		switch (degree + 1) {
		case 0:
			System.out.println("Very Cold! " + degree);
			break;
		case 15:
			System.out.println("Cold! "+ degree);
			break;
		case 20:
			System.out.println("Cool! "+ degree);
			break;
		default:
			System.out.println("Hot! " + degree);
		}
	}
}
