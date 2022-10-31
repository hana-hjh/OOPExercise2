import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		customerPurchased cpurch;
		customer1 c1 = new customer1(100, 80);
		customer2 c2 = new customer2(150, 200);
		
		cpurch = c1;
		System.out.println("Product Purchased: " + cpurch.purchased());
		System.out.println("Total: " + cpurch.totalPrice());
		
		cpurch = c2;
		System.out.println("Product Purchased: " + cpurch.purchased());
		System.out.println("Total: " + cpurch.totalPrice());
	}
}
