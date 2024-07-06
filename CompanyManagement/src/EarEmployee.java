public class EarEmployee extends Employee {

    public EarEmployee() {
    }

    public EarEmployee(String name, String surname, double salary, String work) {
        super(name, surname, salary, work);
    }

    @Override
    public String getEmployeeType() {
        return "EarEmployee";
    }

    @Override
    public Double getPensionTax() {
        return getSalary() * 0.01;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.01;
    }

    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getOneTimeBonus() - getPensionTax() - calculateInsuranceTax();
    }
}
