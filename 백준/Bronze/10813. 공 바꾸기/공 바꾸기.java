import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List list = new ArrayList();
		for(int i=1; i<=N;i++) {
			list.add(i);
		}
		int M= sc.nextInt();
		for(int i=1;i<=M ; i++) {
			int z = sc.nextInt();
			int j = sc.nextInt();
			Collections.swap(list, z-1,j-1);
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " ");
		}
	}
}