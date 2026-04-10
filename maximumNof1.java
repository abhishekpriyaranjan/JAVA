import java.util.Scanner;

public class maximumNof1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter windosize:");
		int k=sc.nextInt();
		
		int count=0;
		int maxcount=0;
		
		for(int i=0;i<k;i++) {
			count+=arr[i];
		}
		maxcount=count;
		for(int i=k;i<arr.length;i++) {
			count+=arr[i]-arr[i-k];
			if(count>maxcount) {
				maxcount=count;
			}
		}
		System.out.println("maximum number of 1s is :"+maxcount);
        sc.close();

	}

}
