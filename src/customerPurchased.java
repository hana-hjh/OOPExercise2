
import org.apache.http.impl.cookie.*;public abstract class customerPurchased
{
	protected int productPrice1;
	protected int productPrice2;
	protected int total;
	
	public customerPurchased(int productPrice1, int productPrice2){
		this.productPrice1 = productPrice1;
		this.productPrice2 = productPrice2;
	}
	
	public abstract String purchased();
	
	public int totalPrice(){
		total = productPrice1 + productPrice2;
		return(total);
	}
	
	public int getprice1(){
		return productPrice1;
	}
	
	public void setprice1(int productPrice1){
		this.productPrice1 = productPrice1;
	}
	
	public int getprice2(){
		return productPrice2;
	}
	
	public void setprice2(int productPrice2){
		this.productPrice2 = productPrice2;
	}
}
