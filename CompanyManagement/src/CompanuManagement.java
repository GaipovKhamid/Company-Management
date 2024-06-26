public class CompanuManagement {

    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentindex = 0;
    private SeasonalEmployee[] seasonalEmployeeArr = new SeasonalEmployee[10];
    private int seasonalIndex = 0;
    private TemporaryEmployee[] temporaryEmployeeArr = new TemporaryEmployee[10];
    private int temporaryIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, double salary, String work, String room) {
        PermanentEmployee employee = new PermanentEmployee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setRoom(room);
        employee.setSalary(salary);
        employee.setWork(work);

        permanentEmployeeArray[permanentindex++] = employee;

        return employee;
    }

    public SeasonalEmployee addSeasonalEmployee(String name, String surname, double salary, String work, String season) {
        SeasonalEmployee employee = new SeasonalEmployee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setSalary(salary);
        employee.setWork(work);
        employee.setSeason(season);

        seasonalEmployeeArr[seasonalIndex++] = employee;
        return employee;

    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, double salary, String work, String workHour) {
        TemporaryEmployee employee = new TemporaryEmployee();
        employee.setName(name);
        employee.setSurname(surname);
        employee.setWorkingHours(workHour);
        employee.setSalary(salary);
        employee.setWork(work);

        temporaryEmployeeArr[temporaryIndex++] = employee;

        return employee;
    }

    public
}
