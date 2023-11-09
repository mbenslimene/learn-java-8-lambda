package org.paumard.streams.data;

public class StreamFromString {

	public static void main(String[] args) {

		String sentence = "the quick brown fox jumps over the lazy dog";
		
		sentence.chars()
			.mapToObj(codePoint -> Character.toString(codePoint))
			.filter(letter -> !letter.equals(" "))
			.distinct()
			.sorted()
			.forEach(letter -> System.out.print(letter));
		
	}
}
