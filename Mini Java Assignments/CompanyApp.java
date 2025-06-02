import java.util.*;

class Employee {
    private int id;
    private String name;
    private String email;
    private String contact;
    private String address;
    private double salary;

    
    public Employee(int id, String name, String email, String contact, String address, double salary) 
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.salary = salary;
    }

    public void setId(int id) 
    { 	this.id = id; 
    }
    public int getId() 
    {	 return id; 
    }

    public void setName(String name) 	
    {	 this.name = name; 
    }
    public String getName() 
    { 	return name; 
    }	

    
    public void setEmail(String email) 
    {	 this.email = email; 
    }
    public String getEmail() 
    {	 return email; 
    }

   
    public void setContact(String contact) 
    {	 this.contact = contact; 
    }
    public String getContact() 
    {	 return contact; 
    }


    public void setAddress(String address) 
    { this.address = address; 
    }
    public String getAddress() 
    {	 return address; 
    }


    public void setSalary(double salary) 
    {	 this.salary = salary; 
    }
    public double getSalary() 
    {	 return salary; 
    }
    
	
    public void displayDetails() 
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Contact: " + contact +", Address: " + address + ", Salary: " + salary);
    }
}

class Company {
    private Employee[] employees;  // Employee is class Name : used for local class
    private int count;

    public Company(int size) {
        employees = new Employee[size];
        count = 0;
    }

    //  case 1. Add Employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Company is full, cannot add more employees.");
        }
    }

    //case 2. Show all Employee details
    public void showAllEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].displayDetails();
        }
    }

    //case 3. Search Employee
    public void searchEmployee(int type, String query) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            switch (type) {
                case 1: // Search by ID
                    if (employees[i].getId() == Integer.parseInt(query)) {
                        employees[i].displayDetails();
                        found = true;
                    }
                    break;
                case 2: // Search by Name
                    if (employees[i].getName().equalsIgnoreCase(query)) {
                        employees[i].displayDetails();
                        found = true;
                    }
                    break;
                case 3: // Search by Email
                    if (employees[i].getEmail().equalsIgnoreCase(query)) {
                        employees[i].displayDetails();
                        found = true;
                    }
                    break;
                case 4: // Search by Salary
                    if (employees[i].getSalary() == Double.parseDouble(query)) {
                        employees[i].displayDetails();
                        found = true;
                    }
                    break;
                case 5: // Search by Address
                    if (employees[i].getAddress().equalsIgnoreCase(query)) {
                        employees[i].displayDetails();
                        found = true;
                    }
                    break;
                default:
                    System.out.println("Invalid search type.");
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    // 4. Delete Employee
    public void deleteEmployee(int type, String query) {
        for (int i = 0; i < count; i++) {
            boolean match = false;
            switch (type) {
                case 1: match = employees[i].getId() == Integer.parseInt(query); break;
                case 2: match = employees[i].getName().equalsIgnoreCase(query); break;
                case 3: match = employees[i].getEmail().equalsIgnoreCase(query); break;
                case 4: match = employees[i].getSalary() == Double.parseDouble(query); break;
                case 5: match = employees[i].getAddress().equalsIgnoreCase(query); break;
            }
            if (match) {
                System.out.println("Deleting Employee: ");
                employees[i].displayDetails();
                // Shift array elements to remove employee
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                return;
            }
        }
        System.out.println("Employee not found for deletion.");
    }

    // 5. Update Employee
    public void updateEmployee(int type, String query, Employee updated) {
        for (int i = 0; i < count; i++) {
            boolean match = false;
            switch (type) {
                case 1: match = employees[i].getId() == Integer.parseInt(query); break;
                case 2: match = employees[i].getName().equalsIgnoreCase(query); break;
                case 3: match = employees[i].getEmail().equalsIgnoreCase(query); break;
                case 4: match = employees[i].getSalary() == Double.parseDouble(query); break;
                case 5: match = employees[i].getAddress().equalsIgnoreCase(query); break;
            }
            if (match) {
                employees[i] = updated;
                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found for update.");
    }

    // 7. Sorting Employees
    public void sortEmployeesByIdAsc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (employees[j].getId() > employees[j + 1].getId()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        System.out.println("Employees sorted by ID in Ascending Order.");
    }

    public void sortEmployeesBySalaryDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
        System.out.println("Employees sorted by Salary in Descending Order.");
    }

    // 8. Display employee with the highest salary
    public void displayHighestSalaryEmployee() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        double maxSalary = employees[0].getSalary();
        Employee highest = employees[0];
        for (int i = 1; i < count; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                highest = employees[i];
            }
        }
        System.out.println("Employee with the Highest Salary:");
        highest.displayDetails();
    }

    // 9. Display employee with the second highest salary
    public void displaySecondHighestSalaryEmployee() {
        if (count < 2) {
            System.out.println("Not enough employees to find second highest salary.");
            return;
        }
        Employee highest = null, secondHighest = null;
        for (int i = 0; i < count; i++) {
            if (highest == null || employees[i].getSalary() > highest.getSalary()) {
                secondHighest = highest;
                highest = employees[i];
            } else if (secondHighest == null || (employees[i].getSalary() > secondHighest.getSalary() && employees[i].getSalary() < highest.getSalary())) {
                secondHighest = employees[i];
            }
        }
        System.out.println("Employee with the Second Highest Salary:");
        secondHighest.displayDetails();
    }

    // 10. Display employees with salary between 10000 and 50000
    public void displayEmployeesWithSalaryRange(double minSalary, double maxSalary) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() >= minSalary && employees[i].getSalary() <= maxSalary) {
                employees[i].displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with salary in the range.");
        }
    }
}
















public class CompanyApp {
    public static void main(String x[]) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company(100);  
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Employee");
            System.out.println("7. Sort Employees");
            System.out.println("8. Display Employee with Highest Salary");
            System.out.println("9. Display Employee with Second Highest Salary");
            System.out.println("10. Display Employees with Salary in Range 10000-50000");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    Employee newEmployee = new Employee(id, name, email, contact, address, salary);
                    company.addEmployee(newEmployee);
                    break;
                case 2:
                    company.showAllEmployees();
                    break;
                case 3:
                    System.out.println("Search by: 1. ID, 2. Name, 3. Email, 4. Salary, 5. Address");
                    int searchType = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter search query: ");
                    String query = scanner.nextLine();

                    company.searchEmployee(searchType, query);
                    break;
                case 4:
                    System.out.println("Delete by: 1. ID, 2. Name, 3. Email, 4. Salary, 5. Address");
                    int deleteType = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter delete query: ");
                    String deleteQuery = scanner.nextLine();

                    company.deleteEmployee(deleteType, deleteQuery);
                    break;
                case 5:
                    System.out.println("Update by: 1. ID, 2. Name, 3. Email, 4. Salary, 5. Address");
                    int updateType = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter update query: ");
                    String updateQuery = scanner.nextLine();
                    System.out.print("Enter new Employee details (ID, Name, Email, Contact, Address, Salary): ");
		    System.out.println("Enter id :-");
                    int newId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
		    System.out.println("Enter Name :-");
                    String newName = scanner.nextLine();
		    System.out.println("Enter Email :-");
                    String newEmail = scanner.nextLine();
		    System.out.println("Enter Contact :-");
                    String newContact = scanner.nextLine();
		    System.out.println("Enter Address :-");
                    String newAddress = scanner.nextLine();
		    System.out.println("Enter Salary :-");
                    double newSalary = scanner.nextDouble();

                    Employee updatedEmployee = new Employee(newId, newName, newEmail, newContact, newAddress, newSalary);
                    company.updateEmployee(updateType, updateQuery, updatedEmployee);
                    break;
                case 7:
                    System.out.println("Sort by: 1. ID Ascending, 2. Salary Descending");
                    int sortType = scanner.nextInt();
                    if (sortType == 1) {
                        company.sortEmployeesByIdAsc();
                    } else if (sortType == 2) {
                        company.sortEmployeesBySalaryDesc();
                    }
                    break;
                case 8:
                    company.displayHighestSalaryEmployee();
                    break;
                case 9:
                    company.displaySecondHighestSalaryEmployee();
                    break;
                case 10:
                    company.displayEmployeesWithSalaryRange(10000, 50000);
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 11);
    }
}

