package Day21;

import java.util.Scanner;

public class code83 {
  public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String text=sc.nextLine();
        sc.close();
        int consonants=0;
        int vowels=0;
        for(int i=0;i<text.length();i++){
            int ch=text.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                vowels++;
            }
            else if(ch==' '){
                continue;
            }
            else{
                consonants++;
            }
        }
        System.out.println("The vowels:"+vowels);
        System.out.println("The consonant:"+consonants);
  }
}
