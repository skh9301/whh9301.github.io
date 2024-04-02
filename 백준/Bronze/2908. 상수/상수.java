import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String tmpA = "";
        String tmpB = "";
        
        for (int i = 0; i < 3; i++) {
        	tmpA = tmpA + a.charAt(2 - i);
        	tmpB = tmpB + b.charAt(2 - i);
        }
        int resultA = Integer.parseInt(tmpA);
        int resultB = Integer.parseInt(tmpB);
        
        if (resultA > resultB) {
            System.out.println(resultA);
        } else {
            System.out.println(resultB);
        }
    }
}