package Abstract;

interface KeluargaFaisal{
	default void sukamakan() {
		System.out.println("Keluarga Faisal suka makan sapi");
	}
}

interface KeluargaDekran{
	default void sukamakan() {
		System.out.println("Keluarga Dekran juga suka sapi");
	}
}

public class InterfaceMultipleInheritance implements KeluargaFaisal, KeluargaDekran{

	@Override
	public void sukamakan() {
		// TODO Auto-generated method stub
		//Keluarga 
		KeluargaFaisal.super.sukamakan();
		//Keluarga Islam
		KeluargaDekran.super.sukamakan();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMultipleInheritance obj = new InterfaceMultipleInheritance(); 
	    obj.sukamakan(); 
	}

}

