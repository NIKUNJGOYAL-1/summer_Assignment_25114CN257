package Day23;

import java.util.Scanner;

public class code91 {
    static boolean isAnagram(String text1,String text2){
        text1= text1.replaceAll("\\s", "").toLowerCase();
        text2= text2.replaceAll("\\s", "").toLowerCase();
        if(text1.length()!=text2.length()){
            return false;
        }
        int[] charCounts= new int [256];
        for(int i=0;i<text1.length();i++){
            charCounts[text1.charAt(i)]++;
            charCounts[text2.charAt(i)]--;
        }
        for(int count : charCounts){
            if(count !=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text1=sc.nextLine();
        System.out.println("enter string");
        String text2=sc.nextLine();
        if(isAnagram(text1, text2)){
            System.out.println("The strings are anagrams");
        }
        else{
            System.out.println("The strings are not anagrams");
        }
    }
}
