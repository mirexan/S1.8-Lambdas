package level_01.exercise_05;

import level_01.exercise_05.classes.Application;

public class Ex05_Main {
	public static void main(String[] args) {
		Application.piValue pi = () -> 3.1415;
		double result = pi.getPiValue();
		System.out.println(result);
	}
}
