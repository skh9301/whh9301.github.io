import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=T;i++) {
			int A= sc.nextInt();
			int B= sc.nextInt();
			sum=A+B;
			System.out.println("Case #"+i+": "+sum);
		}
	
	}

}