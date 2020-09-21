package Week11.lab;

import java.util.ArrayList;

public class Credit extends Payment {
	
	private int installment;
	private int maxInstallmentAmount;
	
	public Credit(Item item, int maxInstallmentAmount) {
		this.item = item;
		this.installment = 0;
		this.maxInstallmentAmount = maxInstallmentAmount;
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return "CREDITS";
	}

	@Override
	public int pay() {
		// TODO Auto-generated method stub
		if(isPaidOff) {
			return 0;
		}
		this.item.Bayar(this.installment);
		
		if(this.item.getHarga() == 0) {
			isPaidOff = true;
		}
		
		return this.item.getHarga();
	}
	
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}else {
			return this.item.getHarga();
		}
	}
	
	public int getInstallment() {
		return this.installment;
	}
	
	public int getMaxInstallment() {
		return this.maxInstallmentAmount;
	}
	
	public void setInstallment() {
		this.installment = this.item.getHargaOri() / this.maxInstallmentAmount;
	}
	
}
