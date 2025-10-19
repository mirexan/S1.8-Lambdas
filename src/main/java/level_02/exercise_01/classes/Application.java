package level_02.exercise_01.classes;

/*Create a list of strings with proper names. Write a method that returns a list of all strings that start with the
	letter 'A' (uppercase) and have exactly 3 letters. Print the result.*/

import java.util.Arrays;
import java.util.List;

public class Application {
	public void start(){
		List<String> names = Arrays.asList("Sandra","Gypsy","DeeDee","Ann");
		List<String> answer = names.stream()
				.filter(name-> name.startsWith("A"))
				.filter(name-> name.length() == 3)
				.toList();
		System.out.println(answer);
	}
}
