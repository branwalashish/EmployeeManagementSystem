
public class EmployeeCreation {

	public static int initNum = 10001;

	
	public Employee createEmployee(String name, Long phone, String email, Double salary, String designation, Double experience, char empType)
	{
		Employee emp = null;
		if(empType=='P'||empType=='p') {
			emp = new PermanentEmployee(initNum++, name, phone, email, salary, experience, designation, true,100);
		}else if(empType=='C' || empType=='c') {
			emp = new ContractEmployee(initNum++, name, phone, email, salary, experience, designation, false,120);
		}
		
		return emp;
	}
}


