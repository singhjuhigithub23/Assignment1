package Assignment;
import java.util.*;

public class Manager {
	private ArrayList<Employee> employees;

    public Manager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee Details:");
            for (Employee employee : employees) {
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Designation: " + employee.getDesignation());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("-----------------------");
            }
        }
    }

    public void searchEmployee(int id) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Employee found:");
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Designation: " + employee.getDesignation());
                System.out.println("Salary: " + employee.getSalary());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}


