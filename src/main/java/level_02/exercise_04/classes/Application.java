package level_02.exercise_04.classes;

import java.util.Arrays;
import java.util.List;

public class Application {
	public void start() {
		List<String> someList = Arrays.asList("1243", "Triana", "598", "Cata", "elf");
		SortingMethods sM = new SortingMethods();
		System.out.println("\n\nNon sorted list :\n" + someList + "\n\n"
				+ "Alphabetically sorted list : \n"
				+ sM.alphabeticSortList(someList) + "\n\n"
				+ "Sort by elements that contain \"e\" first :\n"
				+ sM.eSortList(someList) + "\n\n"
				+ "List with elements that contain \"a\" modified for \"4\" :\n"
				+ sM.aTo4List(someList) + "\n\n"
				+ "Show only numeric elements in list : \n"
				+ sM.showNumeric(someList));
	}

}
