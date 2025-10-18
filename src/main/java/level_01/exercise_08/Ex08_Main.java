package level_01.exercise_08;

import level_01.exercise_08.classes.Application;

public class Ex08_Main {
	public static void main(String[] args) {
		String name = "Mireia";
		Application.reverseString answer = (str) ->
				new StringBuffer(str).reverse().toString();
		String reversedName = answer.reverse(name);
		System.out.printf("Reversed Name: %s\n", reversedName);
	}
}
