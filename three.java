import java.util.Scanner;

class SimpleInterest{
	public static void main(String args[]){
		float SI,principal, rate, time;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal, Rate and Time");
		principal = sc.nextFloat();
		rate = sc.nextFloat();
		time = sc.nextFloat();
		
		SI= (principal*rate*time)/100;
		System.out.println("Simple Interest is "+SI);
	}
	
}