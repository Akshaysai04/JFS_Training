import java.util.*;
public class Max {
    public static void main(String args[]){
         int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
         Arrays.sort(arr);
         System.out.println(arr[arr.length-1]);
}
}
