package Day22;

import java.util.Scanner;

public class code87 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        boolean[] visited=new boolean[text.length()];
        for(int i=0;i<text.length();i++){
            int count=1;
            if(visited[i]){
                continue;
            }
            if(text.charAt(i)==' '){
                continue;
            }
            for(int j=i+1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("The "+text.charAt(i)+" has appeared "+count+" times in string");
        } 
    }
}
