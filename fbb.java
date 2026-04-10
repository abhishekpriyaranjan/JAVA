import java.util.Scanner;
public class fbb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		int first=0;
		int second=1;
		int next=0;
         for(int i=1;i<=n;i++) {
        	 System.out.println(first);
        	 next=first+second;
        	 first=second;
        	 second=next;
		}
        sc.close();
	}

}
