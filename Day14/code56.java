package Day14;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class code56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
        ArrayList <Integer> duplicateList=new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                count++;
                visited[j]=true;
            }
           }
           if (count>1){
               duplicateList.add(arr[i]);
           }
        }
        int []Duplicates =new int [duplicateList.size()];
        for(int i=0;i<duplicateList.size();i++){
            Duplicates[i]=duplicateList.get(i);
        }
        System.out.println("Duplicates:"+Arrays.toString(Duplicates));
        sc.close();
    }
}
