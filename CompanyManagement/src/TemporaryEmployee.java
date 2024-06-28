public class TemporaryEmployee extends Employee {
    private String workingHours;

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

}
