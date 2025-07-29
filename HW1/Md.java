
public class Md {
    public static void main(String args[]){
        //Addition of 2 matrix;
        int a[][]={{1,2},{3,4}};
        int b[][]={{1,2},{3,4}};
        int c[][]=new int[a.length][a[0].length];
        System.out.println("THe sum of the matrix");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        // Getting the sum of the diagonal elements
        int m[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int k=0;k<m.length;k++){
            sum+=m[k][k];   
        }
        System.out.println("Sum of the diagonal elements is :"+sum);
     
         }
}
