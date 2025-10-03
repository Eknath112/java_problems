import java.util.*;

class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

public class _01Employee {
    private HashMap<Integer, String> employeeMap = new HashMap<>();

    public void addEmployee(int id, String name) {
        employeeMap.put(id, name);
    }

    public String getEmployee(int id) throws EmployeeNotFoundException {
        if (!employeeMap.containsKey(id)) {
            throw new EmployeeNotFoundException("Error: Employee ID not found!");
        }
        return employeeMap.get(id);
    }

    public void displayEmployees() {
        System.out.println("Employee Map: " + employeeMap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeMapDemo demo = new EmployeeMapDemo();
        int choice;

        while(true) {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    demo.addEmployee(id, name);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    try {
                        System.out.println("Name: " + demo.getEmployee(searchId));
                    } catch (EmployeeNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    demo.displayEmployees();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        } 
    }
}
