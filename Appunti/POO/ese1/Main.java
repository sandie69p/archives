public class Main {
	public static void main(String[] args) {
		System.out.print("Enter you payout of shopping: ");
		String shoppingBills = System.console().readLine();

		System.out.println("Bill: ${shoppingBills}");

		if(shoppingBills >= 50 && shoppingBills <= 100) {
			shoppingBills -= shoppingBills * 0.10;
		} else if(shoppingBills > 100) {
			shoppingBills -= shoppingBills * 0.20;
		}

		System.out.println("After discount: ${shoppingBills}");
	}
}
