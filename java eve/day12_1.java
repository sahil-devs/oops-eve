class Employee {

    int id;
    String name;
    String department;
    double salary;

    // Default Constructor
    Employee() {
        id = 0;
        name = "Unknown";
        department = "Not Assigned";
        salary = 0;
    }

    // Constructor with Name and Salary
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        department = "General";
    }

    // Full Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + department + " Rs." + salary);
    }
}

public class day12_1 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 45000);
        Employee e3 = new Employee(101, "Neha", "IT", 60000);

        e1.display();
        e2.display();
        e3.display();
    }
}