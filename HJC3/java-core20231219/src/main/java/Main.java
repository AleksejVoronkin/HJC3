import Tools.Employee;
import Tools.Manager;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "doper", "111111111", 1000.0, 25, "2024-06-01");
        Employee olga = new Employee("Olga", "tester", "2222222222", 1500.0, 27, "2023-05-15");
        Employee sergei = new Employee("Sergei", "designer", "333333333", 2000.0, 30, "2021-08-20");
        Employee natalia = new Employee("Natalia", "analitic", "44444444", 2500.0, 35, "2018-02-10");
        Employee andrey = new Employee("Andrey", "devops", "5555555555", 3000.0, 47, "2017-11-05");
        Manager alex = new Manager("Alex", "manager", "6666666666", 5000.0, 40, "2015-17-05");
        
        Employee[] employees = {ivan, olga, sergei, natalia, andrey, alex};

        
        System.out.println("ЗП до повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        Manager.increaseSalary(employees, 25, 500);

        System.out.println("\nЗП после повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        int comparisonResult = Employee.compareDates(andrey.getStartDate(), natalia.getStartDate());
        String longerAtCompany = comparisonResult < 0 ? andrey.getName() : (comparisonResult > 0 ? natalia.getName() : "оба сотрудника работают одинаковое количество времени");
        System.out.println("Сравнение даты устройства на работу между сотрудниками " + andrey.getName() + " и " + natalia.getName() + ". " + longerAtCompany + " работает в компании дольше.");
    }
}
