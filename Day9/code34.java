package Day9;

public class code34 {
    public static void main(String[] args) {
    int n=1;
    int rows=5;
    for(int i=rows;i>=0;i--){
        for(int j=i;j>0;j--){
            //prints inverted number half pyramid
            System.out.print(n);
            //changes the number after each execution
            n++;
        }
        System.out.println();
        //reset the number to 1 for next row operation
        n=1;
    }
    }
}
