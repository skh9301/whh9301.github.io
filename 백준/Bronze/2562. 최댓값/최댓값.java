import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [9];
		int max=0;
		int maxi=0;
		for(int i=0;i<9;i++) {
			int a =sc.nextInt();
			arr[i]= a;
		}
		for(int i=0;i<9;i++) {
			if(max>arr[i]) {
				
			}else {
				max=arr[i];
				maxi=i;
			}
		}
		System.out.println(max);
		System.out.println(maxi+1);
	}
}
