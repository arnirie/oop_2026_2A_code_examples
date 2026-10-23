package uml;

import java.util.Scanner;

public class StudentManager {
    static Student[] students;
    static byte studentMax = 3;
    static byte currentIndex = 0;

    static void main() {
        students = new Student[studentMax];
        Scanner sc = new Scanner(System.in);
        char choice = 0;
        while(choice != 'd'){
            displayMenu();
            System.out.print("Choose an option: ");
            choice = sc.nextLine().toLowerCase().charAt(0);
            switch (choice){
                case 'a':
                    //check if the array is full
                    if(currentIndex == studentMax){
                        System.out.println("Array is full");
                        break;
                    }
                    IO.print("Enter student's name: ");
                    String name = sc.nextLine();
                    IO.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    IO.print("Enter studentId: ");
                    String id = sc.nextLine();
                    IO.print("Enter gpa:");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    addStudent(new Student(name, age, id, gpa));
                    break;
                case 'b':
                    IO.print("Enter id to remove:");
                    String searchId = sc.nextLine();
                    IO.print(searchById(searchId));
                    break;
                case 'c':
                    displayAll();
                    break;
                case 'd':
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Invalid choice input");
            }
        }
    }

    static void displayMenu(){
        System.out.println("=== Student Management System ===");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student by ID");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");
    }

    static void addStudent(Student s){
        students[currentIndex++] = s;
    }

    static void displayAll(){
        if(currentIndex == 0) {
            IO.println("No students to display");
            return;
        }
        for(byte i = 0; i < currentIndex ; i++){
            students[i].displayInfo();
        }
    }

    static int searchById(String id){
        int searchIndex = -1;
        for(byte i = 0 ; i < currentIndex ; i++){
//            if(id == students[i].getStudentId())
            if(id.equalsIgnoreCase(students[i].getStudentId())){
                searchIndex = i;
                break;
            }
        }
        return searchIndex;
//        return index ; else -1 if not found
    }
}
