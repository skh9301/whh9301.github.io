import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int count=N;
		for(int i=0;i<=N;i++) {
			String G= sc.nextLine();
			boolean arr[] = new boolean[26];
			for(int j=0;j<G.length()-1;j++) {
				if(G.charAt(j)!=G.charAt(j+1)) {
					if(arr[G.charAt(j+1)-97] ==true){

						count--;
						break;
					}
				}
				arr[G.charAt(j)-97] =true;
			}
		}
		System.out.println(count);
	}
}


