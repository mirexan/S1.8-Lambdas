package level_01.exercise_08;

public class Ex08_Main {
	@FunctionalInterface
	public interface reverseString {
		String reverse(String str);
	}
	public static void main(String[] args) {
		String name = "Mireia";
		reverseString answer = (str) ->
				new StringBuffer(str).reverse().toString();
		String reversedName = answer.reverse(name);
		System.out.printf("Name :" + name + "\n" +
				"Reversed Name: %s\n", reversedName);
	}
}
