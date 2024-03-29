import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	int N = sc.nextInt();
    	int M=0;
    	List<Integer> list = new ArrayList<>();
    	for(int i=0;i<N;i++) {
    		int a=sc.nextInt();
    		list.add(a);
    	}
    	for(int i=0;i<list.size();i++) {
    		int a =list.get(i);
    		if(a>M) {
    			M=a;
    		}
    	}
    	double sum=0;
    	for(int i=0; i<list.size();i++) {
    		double reselt=((double)list.get(i)/M)*100;
    		sum=reselt+sum;
    	}
    	System.out.print(sum/N);
    }
}



