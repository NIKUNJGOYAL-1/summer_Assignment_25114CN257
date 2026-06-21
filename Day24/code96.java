package Day24;

import java.util.Scanner;

public class code96 {
    static String removeduplicates(String str){
        StringBuilder result= new StringBuilder();
        boolean[] visited= new boolean[str.length()];
        for(int i=0;i<str.length();i++){
            if(visited[i]){
                continue;
            }
            char c=str.charAt(i);
            if(c==' '){
                result.append(c);
                continue;
            }
            for(int j=i+1;j<str.length();j++){
                if(c==str.charAt(j)){
                    visited[j]=true;
                }
            }
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str1=sc.nextLine();
        System.out.println("The string without duplicate characters:"+removeduplicates(str1));
    }
}
