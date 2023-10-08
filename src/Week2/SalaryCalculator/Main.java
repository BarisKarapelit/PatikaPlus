package Week2.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 2000, 45, 1985);
//        Employee employee2 = new Employee("Jane Doe", 1500, 45, 1990);
//        Employee employee3 = new Employee("Jack Doe", 1000, 45, 2000);

        printEmployee(employee1);
        System.out.println();
//        printEmployee(employee2);
//        System.out.println();
//        printEmployee(employee3);
    }

    private static void printEmployee(Employee employee1) {
        System.out.println("Name: " + employee1.name);
        System.out.println("Salary: " + employee1.salary);
        System.out.println("Work Hours: " + employee1.workHours);
        System.out.println("Hire Year: " + employee1.hireYear);
        System.out.println("Tax: " + employee1.getTax());
        System.out.println("Bonus: " + employee1.getBonus());
        System.out.println("Raise Salary: " + employee1.getRaiseSalary());
        System.out.println("Tax + Bonus +  Salary: " + (employee1.getBonus() + employee1.salary- employee1.getTax()));
        System.out.println("Total Salary: " + (employee1.salary + employee1.getBonus() + employee1.getRaiseSalary() - employee1.getTax()));
    }
}
