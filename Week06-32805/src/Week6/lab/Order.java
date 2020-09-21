package Week6.lab;

public class Order {
	
	//Attribute
	private int id;
	private Voucher voucher;
	private Handphone handphone;
	private int jumlah;
	public static int total;
	
	public Order() {}
	public Order(int id, Voucher voucher, int jumlah) {
		this.id = id;
		this.voucher = voucher;
		this.jumlah = jumlah;
	}
	
	public Order(int id, Handphone handphone, int jumlah) {
		this.id = id;
		this.handphone = handphone;
		this.jumlah = jumlah;
	}
	
	public int getID() {
		return id;
	}
	
	public Voucher getVoucher() {
		return voucher;
	}
	
	public Handphone getHandphone() {
		return handphone;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
}