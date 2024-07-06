public class PermanentEmployee extends Employee {

    public PermanentEmployee() {
    }

    public PermanentEmployee(String name, String surname, double salary, String work, String room) {
        super(name, surname, salary, work);
        this.room = room;
    }

    private String room;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String getEmployeeType() {
        return "Permanent";
    }

    @Override
    public Double getOneTimeBonus() { //50%
        return getSalary() * 0.5;
    }

    @Override
    public Double getPensionTax() {
        return getSalary() * 0.075;
    }

    @Override
    public Double calculateInsuranceTax() {
        return getSalary() * 0.01;
    }

    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getOneTimeBonus() - getPensionTax() - calculateInsuranceTax();
    }
}




