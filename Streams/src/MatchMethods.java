import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

public class MatchMethods {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("two apples");
        fruits.add("four bananas");
        fruits.add("one orange");
        fruits.add("five papayas");

        // any match -> returns true if atleast any one of the condition matches .
        // Note : this always takes a predicate as a parameter

        Boolean result = fruits.stream().anyMatch(val -> {
            return val.startsWith("one");
        });
        System.out.println(result);

        // all match -> returns true only if all the objects satisfy the condition

        Boolean result2 = fruits.stream().allMatch(val -> {
            return val.endsWith("one");
        });
        System.out.println(result2);

        // none match -> returns true if none of the objects satisfy the condition
        Boolean result3 = fruits.stream().noneMatch(val -> {
            return val.endsWith("eye");
        });
        System.out.println(result3);
    }
}
