import java.util.Scanner;
public class Customer {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int totalCost = 0;
		int unitPrice = 10;
		System.out.println("Enter the number of food items to be ordered");
		int noFoodItemsToBeOrdered = sc.nextInt();
		for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
			
			System.out.println("Enter the food item");
			String foodItem = sc.next();
			System.out.println("Enter the quantity");
			int quantity = sc.nextInt();
			System.out.println("You have ordered: " + foodItem);
			System.out.println("You have successfully placed the order number: "+ counter);
			totalCost += unitPrice * quantity;
			System.out.println("Total cost of the order: " + totalCost);
		}
	}
}
