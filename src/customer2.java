public class customer2 extends customerPurchased{
	
	public customer2(int productPrice1, int productPrice2){
		super(productPrice1, productPrice2);
	}

	@Override
	public String purchased()
	{
		return "Honey and Chocolate";
	}

	@Override
	public int totalPrice()
	{
		return super.totalPrice();
	}
}
