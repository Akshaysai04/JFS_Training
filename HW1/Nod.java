
import java.util.HashSet;

public class Nod {
 public static void main(String[] args) {
      int[] arr = {1, 1, 3, 4, 2, 6, 2, 8, 9, 12};
      HashSet<Integer> a=new HashSet<>();
      for(int i:arr){
        a.add(i);
      }
      System.err.println("The number of distinct values are "+a.size());
 }   
}
