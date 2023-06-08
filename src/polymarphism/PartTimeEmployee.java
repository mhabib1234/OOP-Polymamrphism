package polymarphism;

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0); // Part-time employees have a fixed hourly rate, so salary is initially set to 0
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary based on hourly rate and hours worked for part-time employees
        double totalSalary = hourlyRate * hoursWorked;
        return totalSalary;
    }
}
