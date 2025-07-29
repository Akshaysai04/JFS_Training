public class IDArray {
    public static void main(String args[]) {
        //declare int array size of 5
        int arr[] = new int[5];
        // intialize array variables
        arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4; arr[4]=5;

        //dynamic array declaration
        int[] j= {5, 2, 1, 4, 3};
        //accessing variables from array 1.using length and index 2.using for each loop
        int len1 = arr.length;
        //reverse array
        for(int i=len1-1;i>0-1;i--){
            System.out.print(arr[i]+" ");
        }
        /*for(int i=0;i<len1;i++) {
            if(i==3){
                continue;
            }    
            else{
                System.out.print(arr[i]+" ");
            }
        System.out.println();    
        }*/
        //for each loop
        /*for(int i: arr) {
            System.out.println(i+" ");    
        }*/
        //using streams
        //Arrays.stream(j);
        //.sorted();
        //.forEach(System.out::println);
    }
}
