package Day9;

public class code35 {
    public static void main(String[] args) {
    char c='A';
    int rows=5;
    for(int i=0;i<rows;i++){
        for(int j=0;j<=i;j++){
            //print the inverted character half pyramid
            System.out.print(c);
        }
        System.out.println();
        //changes character after each row
        c++;
    }
    }
}
