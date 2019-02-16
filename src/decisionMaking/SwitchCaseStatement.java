package decisionMaking;

public class SwitchCaseStatement {
	public static void main(String args[]) {
		int degree = 21;

		switch (degree) {
		case 0:
			System.out.println("Very Cold!");
			break;
		case 15:
			System.out.println("Cold!");
			break;
		case 20:
			System.out.println("Cool!");
			break;
		default:
			System.out.println("Hot!");
		}
	}
}
