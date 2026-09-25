package uml;

import java.util.Scanner;

public class StudentManager {
    static Student[] students;
    static byte studentMax = 3;

    static void main() {
        students = new Student[studentMax];
        Scanner sc = new Scanner(System.in);
        char choice = 0;
        boolean toLoop = true;
        while(toLoop){
            displayMenu();
            System.out.print("Choose an option: ");
            choice = sc.nextLine().toLowerCase().charAt(0);
            switch (choice){
                case 'a':

                    break;
                case 'b':
                    break;
                case 'c':
                    break;
                case 'd':
                    System.out.println("Good bye!");
                    toLoop = false;
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
}
