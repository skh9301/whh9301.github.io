import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	int S= sc.nextInt();
    	for(int j=0; j<S;j++) {
    		int R= sc.nextInt();
    		String P =sc.next();
		    for(int i=0; i<P.length();i++) {
		    	char a=P.charAt(i);
		    	for(int u=0;u<R;u++) {
		    		System.out.print(a);
		    	}
		    }
		    System.out.println();
		}
    }
}