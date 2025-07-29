import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfDistWS {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
        List<Integer> distinctStream = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        long countDistinctStream = Arrays.stream(arr).distinct().count();
        System.out.println("Number of distinct values (using streams): " + countDistinctStream);
    }
}
