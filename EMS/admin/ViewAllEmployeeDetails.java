
import java.util.Set;


public class ViewAllEmployeeDetails {

	public void viewDetails()
	{
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		
		for(Employee employee : eSet)
		{
			System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSalary()
			+"\t"+employee.getExperience()+"\t"+employee.getDesgignation()+"\t"+employee.getPhone()
			+"\t"+employee.getEmail());
		}
	}
	
	
}

