import java.util.Scanner;
public class fact {
	public static int f(int n) {
		if(n==0||n==1) {
			return 1;
		}else {
			return n*f(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		int result=f(n);
		System.out.println(result);
        sc.close();

	}

}
