package Tools;

public class Manager extends Employee { 
    public Manager(String name, String position, String phone, double salary, int age, String startDate) { 
        super(name, position, phone, salary, age, startDate); 
    } 

    public static void increaseSalary(Employee[] employees, int age, int amount) {
        for (Employee employee : employees) {
            if (employee.getAge() > age && !(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + amount);
            }
        }
    }
}