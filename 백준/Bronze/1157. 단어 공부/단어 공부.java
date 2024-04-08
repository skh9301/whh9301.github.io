import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        String input = scanner.nextLine();
		        String result = findMostCommonCharacter(input);
		        System.out.println(result);
		    }

		    public static String findMostCommonCharacter(String input) {
		        String lowercaseInput = input.toLowerCase();

		        Map<Character, Integer> charCountMap = new HashMap<>();

		        for (char c : lowercaseInput.toCharArray()) {
		            if (Character.isLetter(c)) {
		                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		            }
		        }

		        char mostCommonCharacter = '?';
		        int maxCount = 0;
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            int count = entry.getValue();
		            if (count > maxCount) {
		                maxCount = count;
		                mostCommonCharacter = Character.toUpperCase(entry.getKey());
		            } else if (count == maxCount) {
		                mostCommonCharacter = '?';
		            }
		        }

		        return String.valueOf(mostCommonCharacter);
		    }
}
