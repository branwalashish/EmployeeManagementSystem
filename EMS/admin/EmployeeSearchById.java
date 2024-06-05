
import java.util.Set;

public class EmployeeSearchById {

	public Employee search(Integer id)
	{
		Employee foundEmployee = null;

		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		for(Employee employee:eSet)
		{
			if(employee.getId().equals(id))
			{
				System.out.println("\n\t\t\t\tEmployee Founded\n\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				foundEmployee=employee;
				break;
			}
		}
		if(foundEmployee!=null)
		{
			System.out.println(foundEmployee.getId()+"\t"+foundEmployee.getName()+"\t"+foundEmployee.getSalary()
			+"\t"+foundEmployee.getExperience()+"\t"+foundEmployee.getDesgignation()+"\t"+foundEmployee.getPhone()
			+"\t"+foundEmployee.getEmail());
		}
		else
		{
			System.out.println("Employee not found in Database");
		}
		return foundEmployee;
	}


	public boolean findEmp(int id) {
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		Employee foundEmployee = null;
		for (Employee employee : eSet) {
			if (employee.getId().equals(id)) {
				foundEmployee = employee;
				break;
			}
		}
		if (foundEmployee != null) {
			eSet.remove(foundEmployee);
			return true;
		} else {
			return false;

		}

	}


}