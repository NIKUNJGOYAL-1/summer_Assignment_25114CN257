package Day17;

import java.util.Arrays;
import java.util.Scanner;

public class code66 {
    static int[] union(int[] arr1,int[] arr2){
        int []union=new int[arr1.length+arr2.length];
        boolean []visited=new boolean[arr1.length];
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                   visited[j]=true;
                }
            }
            union[count]=arr1[i];
            count++;
        }
        boolean []visited1=new boolean[arr2.length];
    
        for(int i=0;i<arr2.length;i++){
            if(visited1[i]){
                continue;
            }
            for(int j=i+1;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    visited1[j]=true;
                }
            }
             boolean dup=false;
             for(int k=0;k<count;k++){
                 if(union[k]==arr2[i]){ 
                     dup=true;
                     break;  
                    }
                }
                if(!dup){
                    union[count]=arr2[i];
                    count++;
                }
                    
            }

            int []result =new int[count];
            for(int i=0;i<count;i++){
                result[i]=union[i];
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner n=new Scanner(System.in);
            System.out.println("Enter the length of the array");
            int l=n.nextInt();
            int [] arr1=new int[l];
            for(int i=0;i<l;i++){
                System.out.println("enter "+i+"th Element");
                arr1[i]=n.nextInt();//input
        }
        System.out.println("Enter the length of the array");
        int len=n.nextInt();
        int [] arr2=new int[len];
        for(int i=0;i<len;i++){
        System.out.println("enter "+i+"th Element");
        arr2[i]=n.nextInt();//input
        }
        System.out.println("The union of arrays:"+Arrays.toString(union(arr1, arr2)));//output
    }

    }
