package Day30;

import java.util.Scanner;

class student{
    Scanner sc=new Scanner(System.in);
    private int maxStudents;
    private String[] studentNames;
    private String[] studentId;
    private String[] studentGrades;
    public student(){
    System.out.println("Enter the maximum number of student");
    this.maxStudents=sc.nextInt();
    sc.nextLine();
    this.studentNames=new String[maxStudents];
    this.studentId=new String[maxStudents];
    this.studentGrades=new String[maxStudents];
    }
        public void inputStudentData() {
        for (int i = 0; i < maxStudents; i++) {
            System.out.println("\n--- Entering details for Student " + (i + 1) + " ---");
            System.out.print("Enter Student ID: ");
            this.studentId[i] = sc.nextLine();

            System.out.print("Enter Student Name: ");
            this.studentNames[i] = sc.nextLine();

            System.out.print("Enter Student Grade: ");
            this.studentGrades[i] = sc.nextLine();
        }
    }
        public void displayAllStudents() {
        System.out.println("\n=================== STUDENT RECORDS ===================");
        for (int i = 0; i < maxStudents; i++) {
            System.out.println(getFormattedString(i));
        }
    }
    private String getFormattedString(int index) {
    return String.format("ID: %-8s | Name: %-15s | Grade: %-20s", 
            studentId[index], studentNames[index], studentGrades[index]);

}
    public String searchStudent(String Searchid){
     for(int i=0;i<maxStudents;i++){
        if(Searchid.equals(studentId)){
            return studentId[i]+studentNames[i]+studentGrades;
        }
     }
     return "Student with ID " + Searchid + " not found.";
    }
    public void editStudent(String editId) {
        for (int i = 0; i < maxStudents; i++) {
            if (editId.equalsIgnoreCase(studentId[i])) {
                System.out.println("\n--- Editing Student " + studentNames[i] + " ---");
                System.out.print("Enter new Student Name: ");
                this.studentNames[i] = sc.nextLine();
                System.out.print("Enter new Student Grade: ");
                this.studentGrades[i] = sc.nextLine();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + editId + " not found.");
    }
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < maxStudents; i++) {
        sb.append(String.format("ID: %-8s | Name: %-15s | Grade: %-20s\n", 
                studentId[i], studentNames[i], studentGrades[i]));
    }
    return sb.toString();
    }
}
public class code117 {
    public static void main(String[] args) {
        student system= new student();
        boolean running=true;
        int choice;
        Scanner sc=new Scanner(System.in);
        while(running){
            System.out.println("Student record management system");
            System.out.println("1.Add Student\n2.View all student\n3.Search Student\n4.Edit Student Data\n5.Exit");
            System.out.println("Enter your choice(1-5)");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    system.inputStudentData();
                    System.out.println("Student added successfully");
                    break;
                case 2:
                    system.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String idToSearch = sc.nextLine();
                    System.out.println(system.searchStudent(idToSearch));
                    break;
                case 4:
                    System.out.print("Enter Student ID to edit: ");
                    String idToEdit = sc.nextLine();
                    system.editStudent(idToEdit);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}
