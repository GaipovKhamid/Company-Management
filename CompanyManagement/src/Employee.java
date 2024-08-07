public abstract class Employee {
    private String name;
    private String surname;
    private double salary;
    private String work;

    public Employee() {
    }

    public Employee(String name, String surname, double salary, String work) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.work = work;

    }

    public String getDetail() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", work='" + work + '\'';
    }

    public abstract String getEmployeeType();

    public abstract Double getOneTimeBonus();

    public abstract Double getPensionTax();

    public abstract Double calculateInsuranceTax();

    public Double calculateSalaryAfterAllTaxes() {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

}
