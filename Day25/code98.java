package Day25;

import java.util.Scanner;

public class code98 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str1=sc.nextLine();
        System.out.println("enter target string");
        String str2=sc.nextLine();
        System.out.println("The common characters in string are:");
        boolean[] visited=new boolean[str1.length()];
        boolean[] visited2=new boolean[str2.length()];
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        for(int i=0;i<str1.length();i++){
            if(visited[i]){
                continue;
            }
            char c=str1.charAt(i);
            if(c==' '){
                continue;
            }
            for(int j=0;j<str2.length();j++){
                 if(c==str2.charAt(j)){
                     System.out.println(c);
                     visited2[j]=true;
                      break;
                 }
            }
            for(int k=i;k<str1.length();k++){
                if(str1.charAt(k)==c){
                    visited[k]=true;
                }
            }
        }
    }
}
