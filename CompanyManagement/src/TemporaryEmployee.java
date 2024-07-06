public class TemporaryEmployee extends Employee {
    private String workingHours;

    public TemporaryEmployee() {
    }

    public TemporaryEmployee(String name, String surname, double salary, String work, String workingHours) {
            super(name, surname, salary, work);
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public Double getPensionTax() {
        return 0.0;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }

    @Override
    public Double getOneTimeBonus() {
        return 0.0;
    }

    @Override
    public String getEmployeeType() {
        return "Temporary";
    }

    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getOneTimeBonus() - getPensionTax() - calculateInsuranceTax();
    }
}
