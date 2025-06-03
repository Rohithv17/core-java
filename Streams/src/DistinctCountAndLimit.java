import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctCountAndLimit {

    public static void main(String[] args) {
        List<String> tasks = Arrays.asList("play", "sleep", "eat", "play", "run", "study", "jump", "skydive");

        // distinct -> non terminal method

        List<String> distinctTasks = tasks.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctTasks);

        // count -> terminal method

        Long taskCount = tasks.stream().filter(s -> s.length() > 4).count();
        System.out.println(taskCount);

        // limit -> terminal method

        List<String> limitedTasks = tasks.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedTasks);

        // min and max -> non terminal methods

        List<Integer> nums = Arrays.asList(3, 1, 7, 6, 8, 12, 43);

        Optional<Integer> minElement = nums.stream().filter(x -> x > 3).min((val1, val2) -> {
            return val1.compareTo(val2);
        });

        System.out.println(minElement.get());

        Optional<Integer> maxElement = nums.stream().filter(x -> x > 3).max((val1, val2) -> {
            return val1.compareTo(val2);
        });

        System.out.println(maxElement.get());
    }
}
