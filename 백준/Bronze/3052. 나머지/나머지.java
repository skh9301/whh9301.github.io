import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>(); // 제네릭을 사용하여 리스트를 선언하고 초기 용량을 N으로 설정
        for(int i=1; i<=10;i++) {
        	int N=sc.nextInt();
        	int s = N%42;
        	list.add(s);
        	
        }
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
    	
        System.out.println(distinctList.size());
    }
}