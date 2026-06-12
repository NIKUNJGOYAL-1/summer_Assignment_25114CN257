package Day16;
import java.util.*;
public class code64 {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+"th Element");
            arr[i]=sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        int k;
        ArrayList <Integer> Unique =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                visited[j]=true;
            }
           }
            Unique.add(arr[i]);
        }
        int []updatedArr =new int [Unique.size()];
        for(int i=0;i<Unique.size();i++){
            updatedArr[i]=Unique.get(i);
        }
        System.out.println("Updated unique array:"+Arrays.toString(updatedArr));
        sc.close();
    }
}
