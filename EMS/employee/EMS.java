

import java.util.Scanner;

//import com.jspiders.admin.RewardBonus;


public class EMS {

	public static void main(String[] args) {
	
		Services s1 = new Services();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("\t\t\tWelcome to New EMS App  \t(Designed by branwalAshish)");
//		System.out.println("Id      Name   Salary  Experience Designation Phone\tEmail");
		System.out.println("-----------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Operation");
		Services s2 = new Services();
		
		while(true) 
		{
			System.out.println();
			System.out.println(" Enter your choice : ");
			System.out.println(" 1.\tCreate an Employee");
			System.out.println(" 2.\tView All Employee details");
			System.out.println(" 3.\tSearch the Employee");
			System.out.println(" 4.\tUpdate the Employee");
			System.out.println(" 5.\tDelete the Employee");
			System.out.println(" 6.\tExit All Employee details");
			int n = sc.nextInt();
			switch(n) 
			{
			case 1: 
				System.out.println("Enter Name: ");
		   	    String name = sc.next();
		   	    System.out.println("Enter Phone Number: ");
		   	    Long ph = sc.nextLong();
		   	    System.out.println("Enter Email: ");
		   	    String em = sc.next();
		   	    System.out.println("Enter Salary: ");
		   	    Double sal = sc.nextDouble();
		   	    System.out.println("Enter Designation: ");
		   	    String dgi = sc.next();
		   	    System.out.println("Enter Exp: ");
		   	    Double exp = sc.nextDouble();
		   	    System.out.println("Enter Employee Type: ");
		   	    char empT = sc.next().charAt(0);
		   	    
		   	    SetUpApp.eA.addEmployee(new EmployeeCreation().createEmployee(name, ph, em, sal, dgi, exp, empT));
		   	    System.out.println("A Employee Added Successfully");
		   	    		   	    break;
		
			case 2 : 
				System.out.println("Id      Name   Salary  Experience Designation Phone\tEmail");
				SetUpApp.vAED.viewDetails();
				System.out.println();
				break;
				
				
			case 3 : 
				System.out.println("How you want To search");
				System.out.println("Search By Id --> 1");
				System.out.println("Search By Name --> 2");
				System.out.println("Search By PhNo --> 3");
				System.out.println("Search By Email --> 4");
				System.out.println("Select Search");
					int a = sc.nextInt();
					
					switch(a) 
					{
					case 1 : 
						System.out.println("Enter Id");
						int id = sc.nextInt();
						s2.search(id);
						break;
					case 2 :
						System.out.println("Enter Name");
						String naam = sc.next();
						s2.searchName(naam);
						break;
					case 3 :
						System.out.println("Enter Phone Number");
						long phNo = sc.nextInt();
						s2.searchPhone(phNo);
						break;
					case 4 : 
						System.out.println("Enter Email");
						String email = sc.next();
						s2.searchEmail(email);
						break;
					}
					break;
			case 4:
				System.out.println("Details update ");
				System.out.println("Designation update --->\t1");
				System.out.println("Salary update --->\t2");
				System.out.println("Email update --->\t3");
				System.out.println("Phone Update --->\t4");
				System.out.println("Experience Update --->\t5"); 
				System.out.println("Stock Increment  --->\t6"); 
				System.out.println("Stock Decrement  --->\t7"); 
				System.out.println("Extend Contract Period --->\t8");
				System.out.println("Reduce Contract Period --->\t9");
				System.out.println("Add bonus --->\t10");
				
				int u = sc.nextInt();
				
				switch(u)
				{
				case 1: 
				
					System.out.println(" Choose which employee's degignation you want to update by typing their id ");
					int id = sc.nextInt();
//					Employee res1 = SetUpApp.searchByID.search(id);
					Employee res1 = s2.search(id);
					System.out.println("Enter new Designation");
					String deg = sc.next();
					s2.updateDesignation(res1, deg);
					SetUpApp.vAED.viewDetails();
					
					break;
				
				case 2:
					
					System.out.println(" Choose which employee's Salary you want to update by typing their id ");
					int id2 = sc.nextInt();
					Employee res2 = s2.search(id2);
					System.out.println("Enter YOur Salary");
					Double salU = sc.nextDouble();
					s2.updateSalary(res2, salU); // manage 
					SetUpApp.vAED.viewDetails();
					
					break;
					
				case 3:
					System.out.println(" Choose which employee's Email you want to update by typing their id ");
					int id3 = sc.nextInt();
					Employee res3 = s2.search(id3);
					System.out.println("Enter your E-mail");
					String emailU = sc.next();
					s2.updateEmail(res3, emailU);
					SetUpApp.vAED.viewDetails();
					break;
					
				case 4:
					System.out.println(" Choose which employee's Phone number you want to update by typing their id ");
					int id4 = sc.nextInt();
					Employee res4 = s2.search(id4);
					System.out.println("Enter Phone Number");
					Long phoneU = sc.nextLong();
					s2.updatePhone(res4, phoneU);
					SetUpApp.vAED.viewDetails();
					break;
					
				case 5:
					System.out.println(" Choose which employee's Experience you want to update by typing their id ");
					int id5 = sc.nextInt();
					Employee res5 = s2.search(id5);
					System.out.println("Enter your Updated Experience ");
					Double exp1 = sc.nextDouble();
					s2.updateExperience(res5, exp1);
					break;
				
				case 6:
					System.out.println("Enter The ID of the employee which you want to upgrade the Stocks");
					int id6 = sc.nextInt();
					Employee res6 = s2.search(id6);
					System.out.println("Enter Your updated Stock : ");
					int stkI = sc.nextInt();
					s1.increaseStock(res6, stkI);
					System.out.println("Stock Updated Successfully ");
					break;
					
				case 7:
					System.out.println("Enter The ID of the employee which you want to decrement the Stocks");
					int id7 = sc.nextInt();
					Employee res7 = s2.search(id7);
					System.out.println("Enter Your updated Stock for Downgraded :");
					int stkD = sc.nextInt();
					s1.increaseStock(res7, stkD);
					System.out.println("Stock Updated Successfully ");
					break;
					
				case 8:
					System.out.println("Enter The ID of the employee which you want to extend the contract period in days");
					int id8 = sc.nextInt();
					Employee res8 = s2.search(id8);
					System.out.println("Enter the Day to Extend the no. of Day for Contract Employee");
					int extdC = sc.nextInt();
					s2.extendContractPeriod(res8, extdC);
					break;
					
				case 9:
					System.out.println("Enter The ID of the employee which you want to Reduce the contract period in days");
					int id9 = sc.nextInt();
					Employee res9 = s2.search(id9);
					System.out.println("Enter the Day to Reduce the no. of Day for Contract Employee");
					int reduFC = sc.nextInt();
					s2.reduceContractPeriod(res9, reduFC);
					break;
					
				case 10:
					//System.out.println("Sorry It can't be accessible ");
					System.out.println("Enter The ID of the employee which you want to Add bonus in their salary");
					int id10 = sc.nextInt();
					Employee res10 = s2.search(id10);
					System.out.println("Enter The Bonus : ");
					int bon = sc.nextInt();
					RewardBonus.setBonus(bon);
					RewardBonus.addBonus(res10, res10.getSalary());
					break;
				}
				break;
				
				
//				for deleting the employee using id
			case 5:
					System.out.print("Enter Employee id: ");
					int id = sc.nextInt();
					if(SetUpApp.searchByID.findEmp(id)){
						System.out.println(" Employee Deleted Successfully ");
						break;
					}
					
			case 6: 
					System.out.println("Exited Successfully\nNow you have close/terminate the console ");
					System.exit(0);
					
		   	    
			}
		}

	}

}
