package numbers;

public class PrimeNo {

	public static void main(String[] args) {
		int num=13;
		int flag=0;
		
		for(int i=2;i<num/i;i++) {
			if(num%i==0) {
				flag=1;
				break;
				}
			}
		if(flag==0) {
			System.out.println("Prime Number "+num);
			}
		else {
			System.out.println(" Not Prime Number "  +num);
		}

	}

}
