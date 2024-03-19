import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		int A= se.nextInt();
		int B= se.nextInt();
		int C= se.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		
		
	}

}
