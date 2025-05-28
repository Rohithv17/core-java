import java.util.*;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {

        List<Integer> unsortedList = Arrays.asList(10, 1, 3, 2, 7, 9);

        // using sorted to sort the elements

        List<Integer> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());
        System.out.println("after sorting " + sortedList);

        //using sorted to sort in descending order

        List<Integer> sortedDescList = unsortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("after desc order sorting " + sortedDescList);

        // Strings example

        List<String> names = Arrays.asList("john", "rick", "paul", "mike");

        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted names" + sortedNames);

    }
}
