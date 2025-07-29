public class MinValue {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        System.out.println("Minimum value: " + min);
    }
}       
