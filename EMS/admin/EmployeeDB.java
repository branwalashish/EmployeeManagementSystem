import java.util.HashSet;
import java.util.Set;

//Represent Employee Database
//This class represents Database of Employees
public class EmployeeDB {

	private static EmployeeDB empDBRef;
	private Set<Employee> empSet = new HashSet<Employee>();
	//used to store records of employee in Set format
	
	private EmployeeDB()
	{
		
	}
	
	public Set<Employee> getEmpSet()
	{
		return this.empSet;
	}
	
	 public static EmployeeDB getInstance() {
		if(empDBRef == null)
		{
			empDBRef = new EmployeeDB();
		}
		return empDBRef;
	}
	
}
