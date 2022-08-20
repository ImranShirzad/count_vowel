import java.util.Scanner;

/**
 *
 */

/**
 * @author iks93
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Please Enter A String!");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str1 = str.toLowerCase();
		char[] chars = str1.toCharArray();

		int count = 0;

		for (char i : chars) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {

				count++;
			}
		}
		System.out.println(count);
	}
}
