import java.util.*;
public class IDimArray
{
    public static void main(String args[])
    {
        //declare int array size of 5
        int i[]=new int[5];
        //Initialize array variables
        //example on Static array Declaration
        i[0]=1;
        i[1]=2;
        i[2]=3;
        i[3]=4;
        i[4]=5;
        //dynamic array Declaration
        int j[]={1,2,3,4,5};
        //Accessing Values from array
        //using Length and Index
        for(int k=0;k<i.length;k++){
            System.out.println(i[k]+" ");
        }
        //using for-each loop
        System.out.println("");
        for(int K:i){
            System.out.println(K+" ");

        }
        System.out.println("Printing upto last not printing specific element");
        for(int l=0;l<i.length;l++ ){
            if(l!=3){
                System.out.println(i[l]+" ");
            }
        int p=i.length;
        System.out.println(" ");
        for(int o=p-1;o>=0;o--){
            System.out.println(i[o]+"");
        }

        }
Arrays.stream(i)
.sorted()
.forEach(System.out::println);


    }
}
