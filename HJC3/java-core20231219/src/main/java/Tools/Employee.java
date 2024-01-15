package Tools;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    String name;
    String position;
    String phone;
    double salary;
    int age;
    String startDate;

    public Employee(String name, String position, String phone, double salary, int age, String startDate) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.startDate = startDate;// для первого задания ввел переменную отвечающую за дату начала работы в компании ибо вообще не очень понятно о какой дате может идти речь
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStartDate() {
        return startDate;
    }

    public void info() { 
        System.out.println("Employee{" + 
                "name='" + name + '\'' + 
                ", position='" + position + '\'' + 
                ", phone='" + phone + '\'' + 
                ", salary=" + salary + 
                ", age=" + age + 
                ", startDate='" + startDate + '\'' + 
                '}'); 
    }

    @Override
    
    public String toString() {
        return infoFormat();
    }

    public String infoFormat(){ 
        return String.format("Employee {name = '%s'" + 
                        ", position = '%s'" + 
                        ", phone = '%s'" + 
                        ", salary = %.2f" + 
                        ", age = %d" + 
                        ", startDate = '%s' }\n", 
                name, 
                position, 
                phone, 
                salary, 
                age, 
                startDate); 
    }


    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public static int compareDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        return localDate1.compareTo(localDate2);
    }
}