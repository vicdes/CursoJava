package course.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //            EXC RECTANGLE:
//
//        Scanner sc = new Scanner(System.in);
//
//        Rectangle rectangle = new Rectangle();
//        System.out.print("Enter the rectangle width: ");
//        rectangle.width = sc.nextDouble();
//        System.out.print("Enter the rectangle height: ");
//        rectangle.height = sc.nextDouble();
//
//        System.out.println("\n" + rectangle);
//
//        sc.close();
//

//            EXC EMPLOYEE:
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        Employee employee = new Employee();
//        System.out.print("Name: ");
//        employee.name = sc.nextLine();
//        System.out.print("Gross salary: ");
//        employee.grossSalary = sc.nextDouble();
//        System.out.print("Tax: ");
//        employee.tax = sc.nextDouble();
//
//        System.out.println("Employee: " + employee);
//
//        System.out.print("Which percentage to increase salary? ");
//        double percentage = sc.nextDouble();
//        employee.increaseSalary(percentage);
//        System.out.println("\nUpdated data: " + employee);
//
//        sc.close();
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name of the student: ");
        student.name = sc.nextLine();
        System.out.print("First grade: ");
        student.firstGrade = sc.nextDouble();
        System.out.print("Second grade: ");
        student.secondGrade = sc.nextDouble();
        System.out.print("Third grade: ");
        student.thirdGrade = sc.nextDouble();
        student.calculateFinalGrade();

        System.out.println("\n" + student);

        sc.close();
    }
}
