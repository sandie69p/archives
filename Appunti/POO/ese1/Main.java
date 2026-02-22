import java.util.Scanner;

public class Main {
	static private float shoppingBills = 0.0f;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter you payout of shopping: ");
		shoppingBills = scan.nextLine();

		System.out.println("Bill: ${shoppingBills}");

		if(shoppingBills >= 50 && shoppingBills <= 100) {
			shoppingBills -= shoppingBills * 0.10;
		} else if(shoppingBills > 100) {
			shoppingBills -= shoppingBills * 0.20;
		}

		System.out.println("After discount: ${shoppingBills}");
	}
}
