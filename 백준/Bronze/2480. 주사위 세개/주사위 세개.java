import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum=0;
		int max=0;
		
		if(A==B&&B==C&&C==A) {
			sum=10000+A*1000;
		}else if(A==B||B==C||C==A) {
			int a = A==B ? A : B==C ? B : C;
			sum=1000+a*100;
		}else {
            max = Math.max(Math.max(A, B), C); // 가장 큰 눈 결정
            sum = max * 100;
        }
			System.out.println(sum);
	}
}
