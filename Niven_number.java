package spiders;

public class Niven_number {

	public static void main(String[] args) {
		int n=21;  // just change the number you want
		int a=n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;		
			n=n/10;
		}if(a%sum==0) {
			System.out.println("niven ");
		}
		else {
			System.out.println("not");
		}
	}
}
