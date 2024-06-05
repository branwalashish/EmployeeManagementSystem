

import java.util.Set;



public class Services {

//	Employee Addition
	public void addEmployee(Employee employee)
	{
		EmployeeDB.getInstance().getEmpSet().add(employee);
		
	}
//	deleting Employee
	public void delEmployee(Employee employee)
	{
		EmployeeDB.getInstance().getEmpSet().remove(employee);
	}
	
	
	
//	======================================================================================
//						SEARCH THE EMPLOYEE 


	// Search based on ID(Which is auto Generated
	
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
		
				//	Search based on the Name
	
	
	public void searchName(String name)
	{
		Employee foundEmployee = null;
		
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		for(Employee employee:eSet)
		{
			if(employee.getName().equals(name))
			{
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
	}
	
		//		Search Based on Phone Number
//				~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	
	public void searchPhone(Long phone)
	{
		Employee foundEmployee = null;
		
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		for(Employee employee:eSet)
		{
			if(employee.getPhone().equals(phone))
			{
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
	}
	
	
		//	Update based on Email
//			~~~~~~~~~~~~~~~~~~~~~
	
	public void searchEmail(String email)
	{
		Employee foundEmployee = null;
		
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		for(Employee employee:eSet)
		{
			if(employee.getEmail().equals(email))
			{
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
	}
	
	
	
	
//	==============================	Update	Details  =======================

	// phone Update	
	public void updatePhone(Employee employee, Long phone)
	{
		if(employee instanceof Employee) {
			employee.setPhone(phone);
		}
	}
	//Email Update
	public void updateEmail(Employee employee, String email)
	{
		if(employee instanceof Employee)
		{
			employee.setEmail(email);
		}
	}
//	Salary Update
	public  void updateSalary(Employee employee, Double salary)
	{
		if(employee instanceof Employee) {
		employee.setSalary(salary);
		}
		
	}
//	Experience update
	public void updateExperience(Employee employee, Double experience)
	{

		if(employee instanceof Employee) {

			employee.setExperience(experience);
		}
	
	}
	
//	Designation Update
	public void updateDesignation(Employee employee, String designation)
	{

		if(employee instanceof Employee) {
			employee.setDesignation(designation);
		}
	}
	
//	name update
	public void updateName(Employee employee, String name)
	{
		if(employee instanceof Employee) {
			employee.setName(name);
		}
	}
//	================================It is eligible only for Permanent Employee==============

	// Stock	Increment
	public void increaseStock(Employee employee , int noOfStocks)
	{
		if(employee instanceof PermanentEmployee) {
			PermanentEmployee perEmp = (PermanentEmployee)employee;
			perEmp.setStocks(perEmp.getStocks()+noOfStocks);
		}
	}
	//	Stock Decrement
	public void decreaseStock(Employee employee, Integer noOfStock)
	{
		if(employee instanceof PermanentEmployee) {
			PermanentEmployee perEmp = (PermanentEmployee)employee;
			perEmp.setStocks(perEmp.getStocks()-noOfStock);
		}
	}
//	================================It is eligible only for Contract Employee==============	
//	Extend Contract Period
	public void extendContractPeriod(Employee employee, int noOfDays)
	{
		if(employee instanceof ContractEmployee) {
			ContractEmployee contEmp = (ContractEmployee)employee;
			contEmp.setContractPeriod(contEmp.getContractPeriod()+noOfDays);
		}
	}
//	Contract Period Reduction
	public void reduceContractPeriod(Employee employee, int noOfDays)
	{
		if(employee instanceof ContractEmployee) {
			ContractEmployee contEmp = (ContractEmployee)employee;
			contEmp.setContractPeriod(contEmp.getContractPeriod()-noOfDays);
		}
	}
	
	//									UPDATE ENDS
//===================================================================================================================
	
	
}
