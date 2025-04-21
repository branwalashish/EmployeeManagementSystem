import java.util.Scanner;

public class EMS {

    public static void main(String[] args) {

        Services s1 = new Services();
        Services s2 = new Services();

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("\t\t\tWelcome to New EMS App  \t(Designed by branwalAshish)");
        System.out.println("-----------------------------------------------------------------------------");

        while (true) {
            System.out.println();
            System.out.println("Enter your choice: ");
            System.out.println("1.\tCreate an Employee");
            System.out.println("2.\tView All Employee details");
            System.out.println("3.\tSearch the Employee");
            System.out.println("4.\tUpdate the Employee");
            System.out.println("5.\tDelete the Employee");
            System.out.println("6.\tExit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Phone Number: ");
                    long ph = sc.nextLong();
                    System.out.print("Enter Email: ");
                    String em = sc.next();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    System.out.print("Enter Designation: ");
                    String dgi = sc.next();
                    System.out.print("Enter Experience: ");
                    double exp = sc.nextDouble();
                    System.out.print("Enter Employee Type (P/F/C): ");
                    char empT = sc.next().charAt(0);

                    SetUpApp.eA.addEmployee(new EmployeeCreation().createEmployee(name, ph, em, sal, dgi, exp, empT));
                    System.out.println("✅ Employee Added Successfully");
                    break;

                case 2:
                    System.out.printf("%-5s %-10s %-10s %-12s %-15s %-15s %-20s\n", 
                        "ID", "Name", "Salary", "Experience", "Designation", "Phone", "Email");
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    SetUpApp.vAED.viewDetails();
                    break;

                case 3:
                    System.out.println("Search By: 1-Id  2-Name  3-Phone  4-Email");
                    int a = sc.nextInt();

                    switch (a) {
                        case 1:
                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            s2.search(id);
                            break;
                        case 2:
                            System.out.print("Enter Name: ");
                            String naam = sc.next();
                            s2.searchName(naam);
                            break;
                        case 3:
                            System.out.print("Enter Phone: ");
                            long phNo = sc.nextLong();
                            s2.searchPhone(phNo);
                            break;
                        case 4:
                            System.out.print("Enter Email: ");
                            String email = sc.next();
                            s2.searchEmail(email);
                            break;
                        default:
                            System.out.println("Invalid search option.");
                    }
                    break;

                case 4:
                    System.out.println("Update Options:");
                    System.out.println("1. Designation\t2. Salary\t3. Email\t4. Phone");
                    System.out.println("5. Experience\t6. Stock Increment\t7. Stock Decrement");
                    System.out.println("8. Extend Contract\t9. Reduce Contract\t10. Add Bonus");
                    int u = sc.nextInt();

                    switch (u) {
                        case 1:
                            System.out.print("Enter Employee ID: ");
                            int id1 = sc.nextInt();
                            Employee res1 = s2.search(id1);
                            System.out.print("New Designation: ");
                            String deg = sc.next();
                            s2.updateDesignation(res1, deg);
                            break;

                        case 2:
                            System.out.print("Enter Employee ID: ");
                            int id2 = sc.nextInt();
                            Employee res2 = s2.search(id2);
                            System.out.print("New Salary: ");
                            double salU = sc.nextDouble();
                            s2.updateSalary(res2, salU);
                            break;

                        case 3:
                            System.out.print("Enter Employee ID: ");
                            int id3 = sc.nextInt();
                            Employee res3 = s2.search(id3);
                            System.out.print("New Email: ");
                            String emailU = sc.next();
                            s2.updateEmail(res3, emailU);
                            break;

                        case 4:
                            System.out.print("Enter Employee ID: ");
                            int id4 = sc.nextInt();
                            Employee res4 = s2.search(id4);
                            System.out.print("New Phone: ");
                            long phoneU = sc.nextLong();
                            s2.updatePhone(res4, phoneU);
                            break;

                        case 5:
                            System.out.print("Enter Employee ID: ");
                            int id5 = sc.nextInt();
                            Employee res5 = s2.search(id5);
                            System.out.print("New Experience: ");
                            double exp1 = sc.nextDouble();
                            s2.updateExperience(res5, exp1);
                            break;

                        case 6:
                            System.out.print("Enter Employee ID: ");
                            int id6 = sc.nextInt();
                            Employee res6 = s2.search(id6);
                            System.out.print("Stock to Increase: ");
                            int stkI = sc.nextInt();
                            s1.increaseStock(res6, stkI);
                            break;

                        case 7:
                            System.out.print("Enter Employee ID: ");
                            int id7 = sc.nextInt();
                            Employee res7 = s2.search(id7);
                            System.out.print("Stock to Decrease: ");
                            int stkD = sc.nextInt();
                            s1.decreaseStock(res7, stkD);
                            break;

                        case 8:
                            System.out.print("Enter Employee ID: ");
                            int id8 = sc.nextInt();
                            Employee res8 = s2.search(id8);
                            System.out.print("Days to Extend: ");
                            int extDays = sc.nextInt();
                            s2.extendContractPeriod(res8, extDays);
                            break;

                        case 9:
                            System.out.print("Enter Employee ID: ");
                            int id9 = sc.nextInt();
                            Employee res9 = s2.search(id9);
                            System.out.print("Days to Reduce: ");
                            int redDays = sc.nextInt();
                            s2.reduceContractPeriod(res9, redDays);
                            break;

                        case 10:
                            System.out.print("Enter Employee ID: ");
                            int id10 = sc.nextInt();
                            Employee res10 = s2.search(id10);
                            System.out.print("Bonus Amount: ");
                            int bonus = sc.nextInt();
                            RewardBonus.setBonus(bonus);
                            RewardBonus.addBonus(res10, res10.getSalary());
                            break;

                        default:
                            System.out.println("Invalid update option.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int delId = sc.nextInt();
                    if (SetUpApp.searchByID.findEmp(delId)) {
                        System.out.println("✅ Employee Deleted Successfully");
                    } else {
                        System.out.println("❌ Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using EMS App!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option. Try again.");
            }
        }
    }
}
