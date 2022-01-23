
public class Palindrome {
	
	public static void main(StringWorkout[] args) {
		
		int num = 555;
		int temp = num;
		int rem = 0;
		int rev = 0;
		
		while (num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num= num/10;
			
		}
			
		if (temp==rev) {
			System.out.println("palindrome number");
			
		}
		else {
			System.out.println("Not");
		}
		
		
		
	}
	

}
