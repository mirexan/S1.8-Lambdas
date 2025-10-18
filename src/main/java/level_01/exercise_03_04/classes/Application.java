package level_01.exercise_03_04.classes;

import java.util.Arrays;
import java.util.List;


public class Application {
	public void start() {
		List<String> months = Arrays.asList("January ","February ","March "
				,"April ","May ","June ","July ","August ","September ","October ","November ","December");

		exercise03(months);
		exercise04(months);
	}
	public void exercise03(List<String> months) {

		System.out.println("Exercise 03 :");
		months.forEach(month -> System.out.print(month));
		System.out.println("\n");
	}
	public void exercise04(List<String> months) {
		System.out.println("Exercise 04 :");
		months.forEach(System.out::print);
		System.out.println("\n");
	}
}
