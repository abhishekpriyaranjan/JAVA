import java.util.Scanner;

public class armStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=sc.nextInt();
		int original=num;
		int result=0;
		
		while(num>0) {
			int temp=num%10;
			result+=(temp*temp*temp);
			num/=10;
		}
		if(result==original) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not-Armstrong");
		}
        sc.close();


	}

}
