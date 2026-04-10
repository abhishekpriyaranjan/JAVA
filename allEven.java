import java.util.Scanner;

public class allEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("All even number between"+x+"and"+y+"are:");
		for(int i=x;i<=y;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
