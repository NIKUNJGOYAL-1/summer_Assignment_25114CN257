package Day20;
import java.util.*;
public class code80 {
    static void sumofcols(int [][]matrixA){
        int rows =matrixA.length;
        int cols=matrixA[0].length;
            for(int i=0;i<cols;i++){
                int sum =0;
            for(int j=0;j<rows;j++){
                sum+=matrixA[j][i];
            }
            System.out.println("The sum of cols["+i+"] is:"+sum);
        }
       }
       public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows of matrix");
        int rows=sc.nextInt();
        System.out.println("Enter columns of matrix");
        int cols=sc.nextInt();
        int [][]matrixA=new int [rows][cols];
            for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("The column wise sum of matrix");
        sumofcols(matrixA);
       }
}
