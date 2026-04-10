import java.util.Scanner;

public class mathTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num=sc.nextInt();
		int result=0;
		
		for(int i=1;i<=10;i++) {
			result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}
        sc.close();

	}

}
