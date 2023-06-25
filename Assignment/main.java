package Assignment;
import java.util.*;
public class main {
	 public static void main(String[] args) {
	        Manager manager = new Manager();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Employee Management System");

	        while (true) {
	        	
	            System.out.println("Choose an operation");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Display Employees");
	            System.out.println("3. Search Employee");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Designation: ");
	                    String designation = scanner.nextLine();
	                    System.out.print("Enter Salary: ");
	                    double salary = scanner.nextDouble();
	                    scanner.nextLine();
	                    Employee employee = new Employee(id, name, designation, salary);
	                    manager.addEmployee(employee);
	                    break;
	                case 2:
	                    manager.displayEmployees();
	                    break;
	                case 3:
	                    System.out.print("Enter ID to search: ");
	                    int searchId = scanner.nextInt();
	                    scanner.nextLine();
	                    manager.searchEmployee(searchId);
	                    break;
	                case 4:
	                    System.out.println("Exiting the program...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }

	        }
	    }
	}


