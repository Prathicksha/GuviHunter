import java.util.Scanner;

public class Hunter130 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day:");
		String day = scanner.nextLine();
		if ((day.equalsIgnoreCase("saturday"))
				|| (day.equalsIgnoreCase("sunday"))
				|| (day.equalsIgnoreCase("sat"))
				|| (day.equalsIgnoreCase("sun"))) {
			System.out.println("False");
		} else if ((day.equalsIgnoreCase("monday"))
				|| (day.equalsIgnoreCase("tuesday"))
				|| (day.equalsIgnoreCase("wednesday"))
				|| (day.equalsIgnoreCase("thursday"))
				|| (day.equalsIgnoreCase("friday"))
				|| (day.equalsIgnoreCase("mon"))
				|| (day.equalsIgnoreCase("tue"))
				|| (day.equalsIgnoreCase("wed"))
				|| (day.equalsIgnoreCase("thu"))
				|| (day.equalsIgnoreCase("fri"))) {
			System.out.println("True");
		} else {
			System.out.println("Invalid Day");
		}
		scanner.close();
	}
}
