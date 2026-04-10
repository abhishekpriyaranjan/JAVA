import java.util.Scanner;
public class exmp {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int n=sc.nextInt();
        int sum=0;

        for(int i=0;i<=n;i++){
            sum+=i;

        }
        sc.close();
        System.out.println(sum);
        
    }
}
