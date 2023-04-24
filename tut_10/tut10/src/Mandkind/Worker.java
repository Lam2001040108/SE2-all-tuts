package Mandkind;

public class Worker extends Human {
    private double salary;
    private int working_hours;
    private double salary_per_Hours;
    public Worker(String firstName, String lastName, double salary, int working_hours, double salary_per_hours) {
        super(firstName, lastName);
        this.salary = salary;
        this.working_hours = working_hours;
        this.salary_per_Hours = salary_per_hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }

    public double getSalary_per_Hours() {
        return salary_per_Hours;
    }

    public void setSalary_per_Hours(double salary_per_Hours) {
        this.salary_per_Hours = salary_per_Hours;
    }
}
