package Day25;

import java.util.Scanner;

public class code100 {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of words");
        int l=sc.nextInt();
        sc.nextLine();
        String[]words=new String[l];
        for(int i=0;i<l;i++){
            System.out.println("Enter "+(i+1)+"th word");
            words[i]=sc.nextLine();
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].length()<words[j].length()){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp; 
                }
            }
        }
       System.out.println("The sorted words by length ");
       for(String word:words){
        System.out.println(word);
       }
        sc.close();
    }
}
