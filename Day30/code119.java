package Day30;
import java.util.*;
class Employee{
    private int salary;
    private String id,name,department; 
    public void setsalary(int salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("--Error--");
        }
    }
    public void setName(String name){
           this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
           this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setcourse(String department){
        if(department.equalsIgnoreCase("Team management")||department.equalsIgnoreCase("Sales & marketting")||department.equalsIgnoreCase("hr")){    
            this.department=department;
        }
        else{
            System.out.println("The department not available");
        }
    }
    public String getdepartment(){
        return department;
    }
    public int getsalary(){
        return this.salary;
    }
}
public class code119 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        List<Employee> Employees = new ArrayList<>();
        boolean running=true;
        while(running){
            System.out.println("MENU\n1.Add Employee\n2.View employees\n3.Search Employee\n4.Delete Employee\n5.Exit");
            int menuNo=sc.nextInt();
            switch(menuNo){
                case 1:
                    System.out.println("Enter number of Employee");
                    int l=sc.nextInt();
                    for(int i=0;i<l;i++){
                        Employee newEmployee=new Employee();
                        System.out.println("enter salary");
                        newEmployee.setsalary(sc.nextInt());
                        sc.nextLine();
                        System.out.println("enter name");
                        newEmployee.setName(sc.nextLine());
                        System.out.println("enter id");
                        newEmployee.setId(sc.nextLine());
                        System.out.println("enter department(Team managemnt,Sales & marketting and hr)");
                        newEmployee.setcourse(sc.nextLine());
                        Employees.add(newEmployee);
        }
        System.out.println("The details of Employee added");
        System.out.println("________________________________________________");
        for(int i=0;i<l;i++){
            System.out.println("|salary:"+Employees.get(i).getsalary()+" |"+"name:"+Employees.get(i).getName()+"|"+"id:"+Employees.get(i).getId()+"|"+"department:"+Employees.get(i).getdepartment());
        }
        System.out.println("________________________________________________");
        break;
        case 2:
            if(Employees.isEmpty()){
                System.out.println("No records found");
                break;
            }
            System.out.println("________________________________________________");
            for(int i=0;i<Employees.size();i++){
                System.out.println("|salary:"+Employees.get(i).getsalary()+" |"+"name:"+Employees.get(i).getName()+"|"+"id:"+Employees.get(i).getId()+"|"+"department:"+Employees.get(i).getdepartment());
            }
            System.out.println("________________________________________________");
            break;
            case 3:
                sc.nextLine(); // Clear buffer
                System.out.print("Enter Employee ID to Search: ");
                String searchId = sc.nextLine();
                boolean found = false;
                for (Employee s : Employees) {
                    if (s.getId().equalsIgnoreCase(searchId)) {
                            System.out.println("|salary:" + s.getsalary() + " |name:" + s.getName() + "|id:" + s.getId() + "|department:" + s.getdepartment());
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee record not found.");
                    break;
                    
                    case 4:
                        sc.nextLine(); // Clear buffer
                        System.out.print("Enter Employee ID to Delete: ");
                        String deleteId = sc.nextLine();
                        boolean removed = false;
                        for (int i = 0; i < Employees.size(); i++) {
                            if (Employees.get(i).getId().equalsIgnoreCase(deleteId)) {
                                Employees.remove(i);
                                System.out.println("Employee record deleted successfully.");
                                removed = true;
                                break;
                            }
                        }
                        if (!removed) System.out.println("Record not found.");
                        break;
                        case 5:
                            System.out.println("Exit successfull");
                            running =false;
                            break;
                default:
                    System.out.println("Enter valid input");
        
                }
            }
    }
}