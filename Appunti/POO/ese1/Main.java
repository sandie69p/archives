public class Main {
	public static void main(String[] args) {
		System.out.print("Enter you payout of shopping: ");
		String shoppingBills = System.console().readLine();
		float floatedBills = Float.parseFloat(shoppingBills);

		System.out.println("Bill: " + floatedBills);

		if(floatedBills >= 50 && floatedBills <= 100) {
			floatedBills -= floatedBills * 0.10;
		} else if(floatedBills > 100) {
			floatedBills -= floatedBills * 0.20;
		}

		System.out.println("After discount: " + floatedBills);
	}
}
