package polymarphism;

class FullTimeEmployee extends Employee {
    private int vacationDays;
    private double healthInsurance;

    public FullTimeEmployee(int id, String name, double salary, int vacationDays, double healthInsurance) {
        super(id, name, salary);
        this.vacationDays = vacationDays;
        this.healthInsurance = healthInsurance;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary with benefits and deductions for full-time employees
        double baseSalary = getSalary();
        double totalSalary = baseSalary + (vacationDays * 10) - healthInsurance;
        return totalSalary;
    }
}