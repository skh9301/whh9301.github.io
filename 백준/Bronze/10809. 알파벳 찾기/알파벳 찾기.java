import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
	    	String S = sc.nextLine();
	    	boolean b;
	    	for(int i=0;i<26;i++) {
	    		b=true;
	    		for(int j=0;j<S.length();j++) {
	    			char A = S.charAt(j);
	    			if((int)A=='a'+i) {
	    				System.out.print(j+" ");
	    				b=false;
	    				break;
	    			}
	    		}
	    		if(b) {
	    			System.out.print(-1+" ");
	    		}
	    	}
    	}
    }
