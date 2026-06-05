package Day9;

public class code36 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n){
                    //first or last row :print star
                    System.out.print("*");
                }
                //middle rows:print star at the start and end and space in between 
                else{
                    if(j==1||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();//jump to the next line
        }
    }
}
