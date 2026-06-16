package Day20;

import java.util.Scanner;

public class code78 {
    static boolean isSymmetric(int [][]matrixA){
        int rows=matrixA.length;
        int cols=matrixA[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrixA[i][j]==matrixA[j][i] && rows==cols){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
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
        System.out.println("Is matrix symmetric:"+isSymmetric(matrixA));
    }
}
