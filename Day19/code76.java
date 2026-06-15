package Day19;
import java.util.*;
public class code76 {
    static int diagonalSum(int [][]matrix){
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
        }
        return sum;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of matrix(n*n)");
        int n=sc.nextInt();
        int [][]matrixA=new int [n][n];
            for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("the diogonal sum of matrices:"+diagonalSum(matrixA));
    }
}
