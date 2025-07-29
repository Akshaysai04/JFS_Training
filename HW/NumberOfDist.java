import java.util.HashSet;
import java.util.Set;

public class NumberOfDist {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
        Set<Integer> distinctSet = new HashSet<>();
        for (int val : arr) {
            distinctSet.add(val);
        }
        int countDistinct = distinctSet.size();
        System.out.println("Number of distinct values: " + countDistinct);
    }
}
