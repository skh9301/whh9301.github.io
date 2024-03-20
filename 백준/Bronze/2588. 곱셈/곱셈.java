import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int  a = y%10;
		int  b = y%100-a; 
		int c = y-b-a;
				
		int sum1= x*a; //(3)
		int sum2= x*b/10; //(4)
		int sum3= x*c/100;//(5)
		int totalSum = sum1+sum2*10+sum3*100; //(6)
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(totalSum);
	}

}
