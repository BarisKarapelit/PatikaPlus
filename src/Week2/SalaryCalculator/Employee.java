package Week2.SalaryCalculator;

import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int getTax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return (int) (this.salary * 0.03);
        }
    }

    double getBonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double getRaiseSalary() {
        Calendar calendar = Calendar.getInstance();
        int workDuration = calendar.get(Calendar.YEAR) - this.hireYear;
        if (workDuration < 10) {
            return this.salary * 0.05;
        } else if (workDuration >= 10 && workDuration < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
}
