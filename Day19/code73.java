package Day19;

import java.util.*;

public class code73 {
    static int[][] matrixAdd(int [][]matrixA,int[][]matrixB){
        int rows=matrixA.length;
        int cols=matrixA[0].length;
        int[][] sumMatrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        return sumMatrix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("enter columns");
        int cols=sc.nextInt();
        int [][]matrixA=new int [row][cols];
        int [][]matrixB=new int [row][cols];
            for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixA[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixB[i][j]=sc.nextInt();
            }
        }
        System.out.println("the sum of matrices:"+Arrays.deepToString(matrixAdd(matrixA, matrixB)));
    }
}
