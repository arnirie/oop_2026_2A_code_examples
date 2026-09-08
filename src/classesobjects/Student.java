// Author: AR Tamayo
// Date: Sept 01, 2026
// Purpose: Demo Student class

package classesobjects;

import java.sql.Array;
import java.util.ArrayList;

public class Student { //PascalCasing
    private String name;
    private int age;
    private String studentId;
    private double grade;
    private static int studentCount = 0;

    public Student(){
        this.name = "";
        this.age  = 0;
        this.studentId = "";
        this.grade = 0;
        studentCount++;
    }

    //parameterized const
    public Student(String name, int age, String studentId, double grade){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0)        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade >= 65 && grade <= 100) this.grade = grade;
    }

/*
o public void study() → prints "[name] is studying."
o public void displayInfo() → prints all student details in a formatted way
o public static int getTotalStudents() → returns studentCount
 */
    public static int getTotalStudents(){
        return studentCount;
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + this.studentId );
        System.out.println("GPA: " + this.grade);
    }
}

class StudDemo{
    static void main() {
       //arraylist
        ArrayList<Student> students = new ArrayList<Student>();
        Student s = new Student();
        s.setName("vianne");
        students.add(s);
        students.add(new Student("arlyn", 15, "001", 1.6));
    }
}


