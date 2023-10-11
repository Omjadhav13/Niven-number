// This code find the niven numbers present inside a range eg.1-1000

package spiders;

public class Niven_1000 {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=1000;i++) {
			int sum=0;
			int n=i;
			while(n!=0) {
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			if(i%sum==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
