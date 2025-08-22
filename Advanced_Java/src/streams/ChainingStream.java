package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ChainingStream {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Bhanu","Tanu","Manu","Dhanu");
		List<String> streams=list.stream().map(String:: toUpperCase)
        .distinct()
		.sorted()
        .limit(3)
        .filter(str -> str.startsWith("M"))
        .collect(Collectors.toList());
		streams.forEach(System.out::println);
	}
	
	// In Streams the First method output will be the next method input

}
