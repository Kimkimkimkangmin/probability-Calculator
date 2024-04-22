import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("press 1 for combination, 2 for permutation, 3 for factorial");
            int input = s.nextInt();
            if(input==1){
                System.out.println("enter n:");
                int n = s.nextInt();
                System.out.println("enter r:");
                int r = s.nextInt();
                int ncr=1;
                for(int i=n;i>=n-r+1;i--){
                    ncr=ncr*i;
                }
                for(int i=1;i<=r;i++){
                    ncr=ncr/i;
                }
                System.out.println("n combination r = "+ncr);
            } else if(input==2){
                System.out.println("enter n:");
                int n = s.nextInt();
                System.out.println("enter r:");
                int r = s.nextInt();
                int npr=1;
                for(int i=n;i>=n-r+1;i--){
                    npr=npr*i;
                }
                System.out.println("n permutation r = "+npr);
            } else if(input ==3){
                System.out.println("enter n:");
                int n = s.nextInt();
                int nfactorial =1;
                for(int i=1;i<=n;i++){
                    nfactorial=nfactorial*i;
                }
                System.out.println("n factorial = "+nfactorial);
            } else{
                System.out.println("unacceptable input");
            }

        }
    }
}