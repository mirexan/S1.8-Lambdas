package level_02.exercise_03.classes;

public class Application {
	@FunctionalInterface
	public interface Operation {
		float operation(float a, float b);
	}

	public void start(){
	float numOne = 3f;
	float numTwo = 4f;
	Operation addition = (a,b)-> a + b;
	Operation subtraction = (a,b)-> a - b;
	Operation multiplication = (a,b) -> a * b;
	Operation division = (a,b)-> a / b;
		System.out.println("Initialization of operations with "
				+ numOne + " and " + numTwo + "\n" +
				"Addition : " + addition.operation(numOne,numTwo) + "\n" +
				"Substraction : " + subtraction.operation(numOne,numTwo) + "\n" +
				"Multiplication : " + multiplication.operation(numOne,numTwo) + "\n" +
				"Division : " + division.operation(numOne,numTwo) + "\n");
	}
}
