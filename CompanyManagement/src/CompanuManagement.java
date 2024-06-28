public class CompanuManagement {

    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentindex = 0;
    private SeasonalEmployee[] seasonalEmployeeArr = new SeasonalEmployee[10];
    private int seasonalIndex = 0;
    private TemporaryEmployee[] temporaryEmployeeArr = new TemporaryEmployee[10];
    private int temporaryIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, double salary, String work, String room) {
        PermanentEmployee employee = new PermanentEmployee(name, surname, salary, work, room);

        permanentEmployeeArray[permanentindex++] = employee;

        return employee;
    }

    public SeasonalEmployee addSeasonalEmployee(String name, String surname, double salary, String work, String season) {
        SeasonalEmployee employee = new SeasonalEmployee(name, surname, salary, work, season);
        seasonalEmployeeArr[seasonalIndex++] = employee;
        return employee;

    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, double salary, String work, String workHour) {
        TemporaryEmployee employee = new TemporaryEmployee(name, surname, salary, work, workHour);

        temporaryEmployeeArr[temporaryIndex++] = employee;

        return employee;
    }

    public void printAllEmployeeDetail() {
        for (PermanentEmployee employee : permanentEmployeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }
        for (SeasonalEmployee employee : seasonalEmployeeArr) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }
        for (TemporaryEmployee employee : temporaryEmployeeArr) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }
    }

}
