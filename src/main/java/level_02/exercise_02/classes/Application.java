package level_02.exercise_02.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	public void start() {
		List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5);
		String answer = listInteger.stream()
				.map(number->{
					String prefix = number % 2 == 0? "e" : "o";
					return prefix + number;
				})
				.collect(Collectors.joining(", "));
		System.out.println(answer);
	}
}
