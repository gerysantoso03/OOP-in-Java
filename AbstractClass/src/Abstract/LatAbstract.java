package Abstract;



// Abstract class 
abstract class Kendaraan{
	
	//atribut
	private int nopol;
	protected String nama;
	// Asbtract Method
	abstract void roda();
	abstract void bunyi();
	abstract void info(String nama, int nopol);
}

// Class 
class Mobil extends Kendaraan {
		
	void roda() {
		System.out.println("Mobil punya 4 roda");
	}
	void bunyi() {
		System.out.println("Bunyi mobil : BIMMMM BIMMMM");
	}
	void info(String nama, int nopol) {
		System.out.println("Nama : " + nama + "\nNopol : " + nopol);
	}
	
}

class Motor extends Kendaraan {
	
	void roda() {
		System.out.println("Motor punya 2 roda");
	}
	void bunyi() {
		System.out.println("Bunyi motor : NGENGGGG NGENGGGG");
	}
	void info(String nama, int nopol) {
		System.out.println("Nama : " + nama + "\nNopol : " + nopol);
	}
	
}

public class LatAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pemanggilan Class B
		Kendaraan mobil = new Mobil();
		mobil.roda();
		mobil.bunyi();
		mobil.info("Ran", 56789);
		
		System.out.println("----------------------------");
		
		// Pemanggilan class C
		Kendaraan motor = new Motor();
		motor.roda();
		motor.bunyi();
		motor.info("Fafa", 45692);

	}

}
