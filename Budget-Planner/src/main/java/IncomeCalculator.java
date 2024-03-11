public class IncomeCalculator {
    private double taxRate = 0.39;
    private double lmcRate = 0.08;
    private double taxDeduction = 4000;
    private int wage = 130;
    private double salary=0;

    private double calculateSalaryPrimary(Double hours) {
        setSalary(0);
        salary = wage * hours;
        salary = salary - (salary * lmcRate);
        salary = salary - taxDeduction;
        salary = salary - (salary * taxRate);
        salary = salary + taxDeduction;
        return salary;
    }

    private double calculateSalarySecondary(Double hours) {
        setSalary(0);
        salary = wage * hours;
        salary = salary - (salary * lmcRate);
        salary = salary - (salary * taxRate);
        return salary;
    }

    private double calculateUEBPrimary(Double hours) {
        setSalary(0);
        salary = wage * hours;
        salary = salary - (salary * lmcRate);
        salary = salary - taxDeduction;
        salary = salary - (salary * taxRate);
        salary = salary + taxDeduction;
        return salary;
    }

    private double calculateUEBSecondary(Double hours) {
        setSalary(0);
        salary = wage * hours;
        salary = salary - (salary * lmcRate);
        salary = salary - (salary * taxRate);
        return salary;
    }

    public double getSalary(Double hours) {
        return calculateSalarySecondary(hours);
    }

    public double getUEB(Double hours) {
        return calculateUEBSecondary(hours);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
