import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int C=0;
		
		for(int i=1;i<=T;i++) {
			int A= sc.nextInt();
			int B= sc.nextInt();
			C=A+B;
			System.out.println("Case #"+i+": "+A +" + " + B+" = " +C);
		}
	
	}

}
