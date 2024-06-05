
public class ContractEmployee extends Employee {

	private Integer contractPeriod;
	
	public ContractEmployee(Integer id, String name, Long phone, String email, Double salary, Double experience, String desgignation,
			 Boolean isEligibleForBonus, Integer contractPeriod) {
		super(id, name, phone, email, salary, experience, desgignation, isEligibleForBonus);
		this.contractPeriod= contractPeriod;
	}
	
	public Integer getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(Integer contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

}