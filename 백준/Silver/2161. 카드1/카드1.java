import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> cardQ = new LinkedList();
		for(int i=1; i<=n;i++) {
			cardQ.add(i);
		}
		while(cardQ.size()>1) {
			System.out.print(cardQ.poll()+" ");
			cardQ.add(cardQ.poll());
			
		}
		System.out.print(cardQ.peek());
	}
}