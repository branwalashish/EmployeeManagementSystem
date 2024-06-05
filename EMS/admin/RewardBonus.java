

public class RewardBonus {

	static Integer bonus;
	

	public static Integer getBonus() {
		return bonus;
	}


	public static void setBonus(Integer bonus) {
		RewardBonus.bonus = bonus;
	}


	public static void addBonus(Employee employee, Double salary ) {
		
//		if(emp instanceof PermanentEmployee && )
//		{
//			emp.setSalary(salary + bonus) ;
//		}
		
		
		if(employee instanceof PermanentEmployee && employee.getIsEligibleForBonus())
		{
			employee.setSalary(employee.getSalary()+bonus);
		}
		else {
			System.out.println("not eligible for bonus");
		}
		
	}
	
}
