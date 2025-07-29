import java.util.*;
public class Nodd {
    public static void main(String[] args) {
         int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
         HashSet<Integer> a=new HashSet<>();
         for(int i:arr){
            a.add(i);
         }
         System.out.println("The following is the list of distinct elements"+a);
    }
}
