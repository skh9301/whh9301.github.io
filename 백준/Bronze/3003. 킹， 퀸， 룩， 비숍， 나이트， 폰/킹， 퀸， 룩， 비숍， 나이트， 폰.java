import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	for(int i=0; i<2;i++) {
    		int KQ = sc.nextInt();//1
	    	if(KQ==1) {
	    		System.out.print(0+" ");
	    	}else {
	    		System.out.print((1-KQ)+" ");
	    	}
    	}
    	for(int i=0; i<3;i++) {
    		int LSN = sc.nextInt();//2
    		if(LSN==2) {
    			System.out.print(0+" ");
    		}else {
    			System.out.print((2-LSN)+" ");
    		}
    	}
    		int Pon = sc.nextInt();//8
    		if(Pon==8) {
    			System.out.print(0+" ");
    		}else {
    			System.out.print((8-Pon)+" ");
    		}
    }
}