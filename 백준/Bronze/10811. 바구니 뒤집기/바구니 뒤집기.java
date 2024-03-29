import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M = sc.nextInt();
        List<Integer> list = new ArrayList<>(); // 제네릭을 사용하여 리스트를 선언하고 초기 용량을 N으로 설정
        for(int i =0;i<N;i++) {
        	list.add(i+1);
        }
        for(int b=0;b<M;b++) {
        	int i= sc.nextInt();
        	int j= sc.nextInt();
        	Collections.reverse(list.subList(i-1, j));
        }
        for(int i=0;i<list.size();i++) {
        	System.out.print(list.get(i)+" ");
        }
    }
}
