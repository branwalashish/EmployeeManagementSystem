public class EmployeeAddition {

	

    public void addEmployee(Employee employee)
    {
        EmployeeDB
                .getInstance()
                            .getEmpSet()
                                        .add(employee);
        
    }
    
//		we can do like this 
    
//		EmployeeDB eDB = EmployeeDB.getInstance();
//		eDB.getEmpSet().add(employee);

}