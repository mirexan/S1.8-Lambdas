package level_01.exercise_01_02.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationEx01Ex02 {
	public void start(){
		List<String> chappellSongs = new ArrayList<String>(Arrays.asList("Casual",
				"My Kink is Karma", "Good Luck Babe", "Pony"));
		String answerOne = exercise01(chappellSongs);
		String answerTwo =exercise02(chappellSongs);
		System.out.println(answerOne + answerTwo);
	}
	public String exercise01(List<String> chappellSongs){
		List<String> answer = chappellSongs.stream()
				.filter(song -> song.contains("o"))
				.toList();
		return "Exercise 01:\n" +
				"Songs with 'o' found: " + answer + "\n\n";
	}
	public String exercise02(List<String> chappellSongs){
		List<String> answer = chappellSongs.stream()
				.filter(song -> song.contains("o"))
				.filter(song -> song.length() > 5)
				.toList();
		return "Exercise 02:\n" +
				"Songs with 'o' and more tha 5 letters found:"
				+ answer + "\n";
	}
}
