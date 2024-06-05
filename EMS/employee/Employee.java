public class Employee {
	
	public final Integer id;
	private String name;
	private Long phone;
	private String email;
	private Double salary;
	private String designation;
	private Double experience;
	private Boolean isEligibleForBonus;
	
	
	public Employee(Integer id, String name, Long phone, String email, Double salary, Double experience, String designation,
			 Boolean isEligibleForBonus) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
		this.experience = experience;
		this.isEligibleForBonus = isEligibleForBonus;
	}


	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public String getDesgignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public Double getExperience() {
		return experience;
	}


	public void setExperience(Double experience) {
		this.experience = experience;
	}


	public Boolean getIsEligibleForBonus() {
		return isEligibleForBonus;
	}


	public void setIsEligibleForBonus(Boolean isEligibleForBonus) {
		this.isEligibleForBonus = isEligibleForBonus;
	}


	public Integer getId() {
		return id;
	}

	public int hashCode() {
		return this.id;
	}
	
	public boolean equals(Object arg) {
		return this.hashCode()== arg.hashCode();
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", salary=" + salary
				+ ", designation=" + designation + ", experience=" + experience + ", isEligibleForBonus="
				+ isEligibleForBonus + "]";
	}
	
	


	
	
	
	
}
