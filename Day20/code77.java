package Day20;
import java.util.*;
public class code77{
       static int[][] multiplyMatrix(int [][]matrixA,int [][]matrixB){
           int rows=matrixA.length;
           int cols1=matrixA[0].length;
           int cols2=matrixB[0].length;
           int[][] product=new int[rows][cols2];
           for(int i=0;i<rows;i++){
            for(int j=0;j<cols2;j++){
                for(int k=0;k<cols1;k++){
                        product[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            return product;
           }
               public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows for matrix 1");
        int rows=sc.nextInt();
        System.out.println("enter columns for matrix 1");
        int cols=sc.nextInt();
        System.out.println("Enter rows for matrix 2");
        int rows2=sc.nextInt();
        System.out.println("enter columns for matrix 2");
        int cols2=sc.nextInt();
        int [][]matrixA=new int [rows][cols];
        int [][]matrixB=new int [rows2][cols2];
            for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixA[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                System.out.println("Enter the ["+i+"]["+j+"]th element");
            matrixB[i][j]=sc.nextInt();
            }
        }
        if(rows2==cols){
            System.out.println("the product of matrices:"+Arrays.deepToString(multiplyMatrix(matrixA, matrixB)));
        }
    }
       }
