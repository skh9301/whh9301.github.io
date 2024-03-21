import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		B=B+C;
		if(B>=60) {
			A=A+B/60;
			C=B%60;
			B=C;
		}
		if(A<0) {
			A=24+A;
		}else if(A>=24) {
			A=A-24;
		}
		System.out.println(A+" "+B);
	}
}
