package course.application;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary-this.tax;
    }

    public double increaseSalary(double percentage) {
        return this.grossSalary += (percentage*grossSalary)/100;
    }

    public String toString() {
        return this.name
                + ", $ "
                + this.netSalary();
    }
}
