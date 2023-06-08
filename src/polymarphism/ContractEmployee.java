package polymarphism;

class ContractEmployee extends Employee {
    private int contractDuration;
    private double hourlyRate;

    public ContractEmployee(int id, String name, int contractDuration, double hourlyRate) {
        super(id, name, 0); // Contract-based employees have a fixed hourly rate, so salary is initially set to 0
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary based on contracted hours and hourly rate for contract-based employees
        double totalSalary = contractDuration * hourlyRate;
        return totalSalary;
    }
}
