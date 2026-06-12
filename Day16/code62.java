package Day16;

import java.util.Scanner;

public class code62 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int num=0;
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
        int maxCount=1;
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
        if(maxCount<count){
            maxCount=count;
        }
    }
        System.out.println("The numbers which has highest frequency of "+maxCount+" are:");
        for(int k=0;k<n;k++){
           if(visited[k]){
            continue;
        }
           int count=1;
           for(int j=k+1;j<n;j++){
               if(arr[k]==arr[j]){
                   count++;
                visited[j]=true;
            }
        }
        if(maxCount==count){
            System.out.println(arr[k]);
        }
    }
    sc.close();
}
}
