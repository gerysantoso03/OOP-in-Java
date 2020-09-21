package Abstract;


abstract class Nenek{
	abstract void warnakulit();
}

class ayah extends Nenek{
	void warnakulit() {
		System.out.println("warna kulit ayah Biru");
	}
}

class ibu extends Nenek{
	void warnakulit() {
		System.out.println("warna kulit ibu Hijau");
	}
}


public class TestMultipleInheritance extends ayah{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultipleInheritance obj = new TestMultipleInheritance(); 
	    obj.warnakulit(); 
	}

}
