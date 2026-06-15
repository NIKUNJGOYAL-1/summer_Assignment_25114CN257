package Day19;

import java.util.Arrays;
import java.util.Scanner;

public class code74 {
        static int[][] matrixSub(int [][]matrixA,int[][]matrixB){
        int rows=matrixA.length;
        int cols=matrixA[0].length;
        int[][] subMatrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                subMatrix[i][j]=matrixA[i][j]-matrixB[i][j];
            }
        }
        return subMatrix;
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
        System.out.println("the difference of matrices:"+Arrays.deepToString(matrixSub(matrixA, matrixB)));
    }
}
