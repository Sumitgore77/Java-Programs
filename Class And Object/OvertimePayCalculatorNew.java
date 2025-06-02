class Employee {
    int id;
    String name;
    int totalWorkingHours;
    double salary;
    double overtime;
    
    Employee(int id, String name, int totalWorkingHours, double salary) {
        this.id = id;
        this.name = name;
        this.totalWorkingHours = totalWorkingHours;
        this.salary = salary;
        this.overtime = 0;
    }
    
    void displayInformation() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Salary: Rs." + salary);
        System.out.println("Overtime Pay: Rs." + overtime);
        System.out.println("-------------------------");
    }
}

class OverTime {
    Employee employees[];
    
    void setEmployee(Employee emp[]) {
        employees = emp;
    }
    
    void calculateOvertime() {
        for (int i = 0; i < employees.length; i++) {
            int overtimeHours = employees[i].totalWorkingHours - 40;
            if (overtimeHours > 0) {
                employees[i].overtime = overtimeHours * 50;
                employees[i].salary += employees[i].overtime;
            }
        }
    }
}

public class OvertimePayCalculatorNew {
    public static void main(String args[]) {
        Employee empArr[] = new Employee[5];
        empArr[0] = new Employee(1, "John", 45, 20000);
        empArr[1] = new Employee(2, "Jane", 40, 22000);
        empArr[2] = new Employee(3, "Mike", 50, 25000);
        empArr[3] = new Employee(4, "Anna", 38, 18000);
        empArr[4] = new Employee(5, "David", 42, 23000);
        
        OverTime overtimeCalculator = new OverTime();
        overtimeCalculator.setEmployee(empArr);
        overtimeCalculator.calculateOvertime();
        
        for (int i = 0; i < empArr.length; i++) {
            empArr[i].displayInformation();
        }
    }
}
