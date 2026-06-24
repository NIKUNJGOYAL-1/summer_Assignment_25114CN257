package Day27;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int age;
    private String id,name,course; 
    public void setAge(int age){
        if(age>0&&age<60){
            this.age=age;
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
    public void setcourse(String course){
        if(course.equalsIgnoreCase("btech")||course.equalsIgnoreCase("bca")||course.equalsIgnoreCase("mba")){    
            this.course=course;
        }
        else{
            System.out.println("The course not available");
        }
    }
    public String getcourse(){
        return course;
    }
    public int getAge(){
        return this.age;
    }
}
public class code105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Student> st = new ArrayList<>();
        boolean running=true;
        while(running){
            System.out.println("MENU\n1.Add\n2.View\n3.Search\n4.Delete\n5.Exit");
            int menuNo=sc.nextInt();
            switch(menuNo){
                case 1:
                    System.out.println("Enter number of student");
                    int l=sc.nextInt();
                    for(int i=0;i<l;i++){
                        Student newStudent=new Student();
                        System.out.println("enter age");
                        newStudent.setAge(sc.nextInt());
                        sc.nextLine();
                        System.out.println("enter name");
                        newStudent.setName(sc.nextLine());
                        System.out.println("enter id");
                        newStudent.setId(sc.nextLine());
                        System.out.println("enter couse(btech,bca and mba)");
                        newStudent.setcourse(sc.nextLine());
                        st.add(newStudent);
        }
        System.out.println("The details of student added");
        System.out.println("________________________________________________");
        for(int i=0;i<l;i++){
            System.out.println("|age:"+st.get(i).getAge()+" |"+"name:"+st.get(i).getName()+"|"+"id:"+st.get(i).getId()+"|"+"course:"+st.get(i).getcourse());
        }
        System.out.println("________________________________________________");
        break;
        case 2:
            if(st.isEmpty()){
                System.out.println("No records found");
                break;
            }
            System.out.println("________________________________________________");
            for(int i=0;i<st.size();i++){
                System.out.println("|age:"+st.get(i).getAge()+" |"+"name:"+st.get(i).getName()+"|"+"id:"+st.get(i).getId()+"|"+"course:"+st.get(i).getcourse());
            }
            System.out.println("________________________________________________");
            break;
            case 3:
                sc.nextLine(); // Clear buffer
                System.out.print("Enter Student ID to Search: ");
                String searchId = sc.nextLine();
                boolean found = false;
                for (Student s : st) {
                    if (s.getId().equalsIgnoreCase(searchId)) {
                            System.out.println("|age:" + s.getAge() + " |name:" + s.getName() + "|id:" + s.getId() + "|course:" + s.getcourse());
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student record not found.");
                    break;
                    
                    case 4:
                        sc.nextLine(); // Clear buffer
                        System.out.print("Enter Student ID to Delete: ");
                        String deleteId = sc.nextLine();
                        boolean removed = false;
                        for (int i = 0; i < st.size(); i++) {
                            if (st.get(i).getId().equalsIgnoreCase(deleteId)) {
                                st.remove(i);
                                System.out.println("Student record deleted successfully.");
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
