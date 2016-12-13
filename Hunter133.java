import java.util.Scanner;

public class Hunter133 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String[] str2 = str1.split(" ");
		String str3 = "";
		for (int i = str2.length - 1; i >= 0; i--) {
			str3 += str2[i] + " ";
		}
		System.out.println(str3);
		scanner.close();
	}
}
