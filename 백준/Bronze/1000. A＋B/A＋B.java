import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		int A = se.nextInt();
		int B = se.nextInt();
		int sum= 0;
		if(A>0 &&B<10) {
			sum=A+B;
		}else {
			System.out.println("10미만의 정수 값이 아닙니다.");
		}
		System.out.println(sum);
	}

}
