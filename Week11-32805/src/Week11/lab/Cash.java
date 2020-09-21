package Week11.lab;


public class Cash extends Payment {
	
	public Cash(Item item) {
		super(item);
	}
	
	public int pay() {
		if(isPaidOff) {
			return 0;
		}
		isPaidOff = true;
		return this.item.getHarga();
	}
	
	public String getClassName() {
		return "CASH";
	}
}
