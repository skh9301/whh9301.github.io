import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>(); // 제네릭을 사용하여 리스트를 선언하고 초기 용량을 N으로 설정
        for (int i = 0; i < 28; i++) {
        	int N = sc.nextInt();
            list.add(N); // 입력받은 값을 리스트에 추가
        }
        for(int i = 1 ;i<=30;i++) {
        	if(list.contains(i)) {
        		
        	}else {
        		System.out.println(i);
        	}
        	
        }
        
    }
}
