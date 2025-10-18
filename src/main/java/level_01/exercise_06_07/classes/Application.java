package level_01.exercise_06_07.classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Application {
	public void start() {
		List<String> things = Arrays.asList("12654", "534", "Sharon Needles", "Marina");
		List<String> answer_06 = exercise06(things);
		List<String> answer_07 = exercise07(things);
		System.out.println("Exercise 06 : " + answer_06 + "\n" +
				"Exercise 07 : " + answer_07);
	}
	public List<String> exercise06(List<String> things) {
		List<String> answer = things.stream()
				.sorted(Comparator.comparingInt(String::length))
				.toList();
		return answer;
	}
	public List<String> exercise07(List<String> things) {
		List<String> answer = things.stream()
				.sorted(Comparator.comparingInt(String::length).reversed())
				.toList();
		return answer;
	}
}
