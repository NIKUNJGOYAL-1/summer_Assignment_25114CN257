package Day19;
import java.util.*;
public class code75 {
    static int[][] transpose(int [][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int [][] transpose=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
             transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("enter columns");
        int cols=sc.nextInt();
        int [][]matrixA=new int [row][cols];
            for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("the transpose of matrices:"+Arrays.deepToString(transpose(matrixA)));
    }
}
