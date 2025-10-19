package level_02.exercise_04.classes;

import java.util.Comparator;
import java.util.List;

public class SortingMethods {
	public List<String> alphabeticSortList(List<String> someList) {
		List<String> sortedList = someList.stream()
				.sorted(Comparator.comparingInt(e -> e.charAt(0)))
				.toList();
		return sortedList;
	}
	public List<String> eSortList(List<String> someList) {
		List<String> ansewerList = someList.stream()
				.sorted((String a, String b) -> {
					int sortingValue = a.contains("e")?1:0;
					int sortingValue2 = b.contains("e")?1:0;
					return sortingValue2 - sortingValue;
				} )
				.toList();
		return ansewerList;
	}
	public List<String> aTo4List(List<String> someList) {
		List<String> ansewerList = someList.stream()
				.map(e ->{
					String modified = e.replaceAll("a","4");
					return modified;
				})
				.toList();
		return ansewerList;
	}
	public List<String> showNumeric(List<String> someList) {
		List<String> ansewerList = someList.stream()
				.filter(e -> e.matches("[0-9]+"))
				.toList();
		return ansewerList;
	}
}
