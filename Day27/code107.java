package Day27;
import java.util.*;
class Employee{
    private String id;
    private String name;
    private double baseSalary;
    private double allowances;
    private double taxRate;
    public Employee(String id, String name, double baseSalary, double allowances, double taxRate) {
        if(taxRate>=0&&allowances>=0&&baseSalary>=0){
            this.id = id;
            this.name = name;
            this.baseSalary = baseSalary;
            this.allowances = allowances;
            this.taxRate = taxRate;
        }
        else{
            System.out.println("Error :Invalid Input");
        }
    }
    public double grossSalary(){
        return baseSalary+allowances;
    }
    public double taxDeduction(){
        return grossSalary()*taxRate;
    }
    public double netSalary(){
        return grossSalary()-taxDeduction();
    }
    public void displayPayslip() {
        System.out.println("\n==================================");
        System.out.println("            PAYSLIP OF EMPLOYEE               ");
        System.out.println("==================================");
        System.out.printf("Employee ID   : %s%n", id);
        System.out.printf("Name          : %s%n", name);
        System.out.printf("Base Salary   : Rs%.2f%n", baseSalary);
        System.out.printf("Allowances    : Rs%.2f%n", allowances);
        System.out.printf("Gross Salary  : Rs%.2f%n",grossSalary());
        System.out.printf("Tax Deduction : Rs%.2f (%.0f%%)%n", taxDeduction(), (taxRate * 100));
        System.out.println("----------------------------------");
        System.out.printf("NET TAKE-HOME : Rs%.2f%n", netSalary());
        System.out.println("==================================");
    }
    
    public String getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public double getAllowances() { return allowances; }
    public double getTaxRate() { return taxRate; }
}
class PayrollManager {
    // Fixed: Initialized the list to prevent NullPointerException
    private List<Employee> employees = new ArrayList<>(); 

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee registration successful!");
    }

    public Employee findEmployee(String id) {
        for (Employee emp : employees) {
            if (emp.getId().equalsIgnoreCase(id)) {
                return emp;
            }
        }
        return null;
    }

    public void displayAllSalaries() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }
        System.out.println("\n-----------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-15s %-12s %-12s%n", "ID", "Name", "Gross Salary", "Deductions", "Net Salary");
        System.out.println("-----------------------------------------------------------------------------");
        for (Employee emp : employees) {
            // Fixed: Matched the correct method names defined in the Employee class
            System.out.printf("%-10s %-20s Rs%-14.2f Rs%-11.2f Rs%-11.2f%n", 
                    emp.getId(), emp.getName(), emp.grossSalary(), emp.taxDeduction(), emp.netSalary());
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
public class code107 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PayrollManager manager=new PayrollManager();
         manager.addEmployee(new Employee("E001", "Alice Smith", 5000, 1200, 0.12));
        manager.addEmployee(new Employee("E002", "Bob Jones", 6200, 800, 0.15));

        while (true) {
            System.out.println("\n--- SALARY MANAGEMENT SYSTEM ---");
            System.out.println("1. Register New Employee");
            System.out.println("2. Generate Employee Payslip");
            System.out.println("3. View Payroll Summary Report");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            
            // Fixed: Read option as a string line to prevent Scanner buffer skipping bugs
            String choiceInput = sc.nextLine(); 
            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();
                    if (manager.findEmployee(id) != null) {
                        System.out.println("Error: Employee ID already exists.");
                        break;
                    }
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Base Salary (Rs): ");
                    double base = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Total Allowances (Rs): ");
                    double allowances = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Tax Rate percentage (e.g., 15 for 15%): ");
                    double taxPercent = Double.parseDouble(sc.nextLine());
                    double taxRate = taxPercent / 100.0;

                    manager.addEmployee(new Employee(id, name, base, allowances, taxRate));
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    String searchId = sc.nextLine();
                    Employee emp = manager.findEmployee(searchId);
                    if (emp != null) {
                        emp.displayPayslip();
                    } else {
                        System.out.println("Employee record not found.");
                    }
                    break;

                case 3:
                    manager.displayAllSalaries();
                    break;

                case 4:
                    System.out.println("System closed. Exiting application.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }
}

