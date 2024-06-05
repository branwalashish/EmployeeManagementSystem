public class PermanentEmployee extends Employee{

        private Integer stocks;
        
        public PermanentEmployee(Integer id, String name, Long phone, String email, Double salary, 
                Double experience, String desgignation, Boolean isEligibleForBonus, Integer stocks) {
            super(id, name, phone, email, salary, experience, desgignation, isEligibleForBonus);
            this.stocks=stocks;
    }
    
        public Integer getStocks() {
            return stocks;
        }
    
        public void setStocks(Integer stocks) {
            this.stocks = stocks;
        }
            
    }

