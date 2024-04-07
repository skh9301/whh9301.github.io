import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        
        
        int middleIndex = N.length() / 2;
        
        boolean isSymmetric = true;
        for (int i = 0; i < middleIndex; i++) {
            if (N.charAt(i) != N.charAt(N.length() - 1 - i)) {
                isSymmetric = false;
                break;
            }
        }
        System.out.println(isSymmetric ? 1 : 0);
    }
}