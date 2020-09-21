package Week11.tutorial;

public class PrintNameEmployeeAddedListener implements EmployeeAddedListener{

	@Override
	public void onEmployeeAdded(Employee employee) {
		// TODO Auto-generated method stub
		// Print nama karyawan yang baru ditambahkan
		System.out.println("Ditambahkan karyawan baru dengan posisi " + employee.getPosition() + " bernama " + employee.getNama());
	}
	
}
