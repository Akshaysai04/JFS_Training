import java.util.Arrays;

public class MaxValueWS {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
        int maxStream = Arrays.stream(arr).max().orElseThrow();
        System.out.println("4. Maximum value (using streams): " + maxStream);
    }
}
