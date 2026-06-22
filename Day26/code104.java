package Day26;
import java.util.*;
public class code104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0;
        
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "How many days are in a leap year?"
        };

        String[][] options = {
            {"1. London", "2. Paris", "3. Rome", "4. Berlin"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"},
            {"1. 364", "2. 365", "3. 366", "4. 367"}
        };
        int[] correctAnswers = {2, 2, 3}; 
        System.out.println("--- WELCOME TO THE QUIZ ---");
        for(int i=0;i<questions.length;i++){
            System.out.println("\nQuestion "+(i+1)+"\n"+questions[i]);
            System.out.println(options[i][0]);
            System.out.println(options[i][1]);
            System.out.println(options[i][2]);
            System.out.println(options[i][3]);

            System.out.println("Enter your choice(1-4)");
            int userAns=sc.nextInt();
            if(userAns==correctAnswers[i]){
                System.out.println("correct!");
                score++;
            }
            else{
                System.out.println("wrong answer and the correct answer is:"+correctAnswers[i]);
            }
            
        }
        double percentage=(score/3)*100;
        System.out.println("The your percentage is:"+percentage);
        addQuestion(questions, options);
    }
        
}
