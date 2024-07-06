public class PartnerEmployee extends Employee {
    private String companyName;

    public PartnerEmployee(String name, String surname, double salary, String work, String companyName) {
        super(name, surname, salary, work);
        this.companyName = companyName;
    }

    public PartnerEmployee() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getEmployeeType() {
        return "Partner";
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.75;
    }

    @Override
    public Double getPensionTax() {
        return getSalary() * 0.05;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }

    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getOneTimeBonus() - getPensionTax() - calculateInsuranceTax();
    }

}