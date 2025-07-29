import java.util.Arrays;

public class MinValueWS {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
        int minStream = Arrays.stream(arr).min().orElseThrow();
        System.out.println("Minimum value (using streams): " + minStream);
    }
}
