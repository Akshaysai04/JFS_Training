public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        System.out.println("3. Maximum value: " + max);

    }
}
