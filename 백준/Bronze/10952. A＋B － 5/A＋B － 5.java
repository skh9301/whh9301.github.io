import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
	
		while(true) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			sum=A+B;
			if(A==0 && B==0) {
				break;
			}
			System.out.println(sum);
		}
	}

}
