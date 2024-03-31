import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String h= sc.nextLine();
		int sum = 0;
			for (int i = 0; i < h.length(); i++) {
				sum+= h.charAt(i) - '0';
			}
			System.out.print(sum); 
	}
}