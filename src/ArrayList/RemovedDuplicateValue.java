package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovedDuplicateValue {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 5, 4, 8, 7, 7, 9, 9, 10));

		// 1. To removed Duplicate Use Linked Has Set

		LinkedHashSet<Integer> LinkedHasSet = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> numberwithoutduplicates = new ArrayList<Integer>(LinkedHasSet);

		System.out.println(numberwithoutduplicates);

		ArrayList<Integer> marksList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10));
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);

	}
}
