public class customer1 extends customerPurchased{
	
	public customer1(int productPrice1, int productPrice2){
		super(productPrice1, productPrice2);
	}

	@Override
	public String purchased()
	{
		return "Milk and Sugar";
	}

	@Override
	public int totalPrice()
	{
		return super.totalPrice();
	}
	

	
}


