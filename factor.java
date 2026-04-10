import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num=sc.nextInt();
		System.out.println("All Factor of"+num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
        sc.close();

	}

}
