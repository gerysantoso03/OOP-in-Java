package Week11.tutorial;

public class CountingEmployeeAddedListener implements EmployeeAddedListener {
	
	private static int employeesAddedCount;
	
	@Override
	public void onEmployeeAdded(Employee employee) {
		// TODO Auto-generated method stub
		// Increment Jumlah Karyawan
		employeesAddedCount++;
		// Print jumlah Karyawan
		System.out.println("Total Karyawan : " + employeesAddedCount);
	}
	
}
