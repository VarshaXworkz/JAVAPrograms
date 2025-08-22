package streams;

import java.util.Arrays;
import java.util.List;

public class TerminalStream {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);

		int sum = list.stream()

		.map(n -> n * 2)

		.reduce(0, Integer::sum);

		System.out.println("Sum = " + sum);

		long count = list.stream()

		.filter(n -> n % 2 == 0)

		.count();

		System.out.println("count" + count);
	}
}
