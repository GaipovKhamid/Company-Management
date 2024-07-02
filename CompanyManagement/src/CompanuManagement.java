public class CompanuManagement {

    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentindex = 0;
    private SeasonalEmployee[] seasonalEmployeeArr = new SeasonalEmployee[10];
    private int seasonalIndex = 0;
    private TemporaryEmployee[] temporaryEmployeeArr = new TemporaryEmployee[10];
    private int temporaryIndex = 0;

    private Employee[] employeeArray = new Employee[10];
    private int arrayIndex = 0;

    public PermanentEmployee addPermanentEmployee(String name, String surname, double salary, String work, String room) {
        PermanentEmployee employee = new PermanentEmployee(name, surname, salary, work, room);
        employeeArray[arrayIndex++] = employee;
        return employee;
    }

    public SeasonalEmployee addSeasonalEmployee(String name, String surname, double salary, String work, String season) {
        SeasonalEmployee employee = new SeasonalEmployee(name, surname, salary, work, season);
        employeeArray[arrayIndex++] = employee;
        return employee;

    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, double salary, String work, String workHour) {
        TemporaryEmployee employee = new TemporaryEmployee(name, surname, salary, work, workHour);
        employeeArray[arrayIndex++] = employee;
        return employee;
    }

    public void printAllEmployeeDetail() {
//        PermanentEmployee permanentEmployee = new PermanentEmployee();
//        SeasonalEmployee seasonalEmployee = new SeasonalEmployee();
//        TemporaryEmployee temporaryEmployee = new TemporaryEmployee();
//
//        Employee perEmployees = new PermanentEmployee("Khamid", "Gaipov", 1200d, "IT", "3");
//        Employee seasonEmployees = new SeasonalEmployee("Khamid", "Gaipov", 1200d, "Gardener", "Spring");
//        Employee tempEmployee = new TemporaryEmployee("Khamid", "Gaipov", 1200d, "don`t know", "3");
//
//        System.out.println(perEmployees.getDetail());
//        System.out.println(seasonEmployees.getDetail());
//        System.out.println(tempEmployee.getDetail());

        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getDetail());
            }
        }
    }

    public void printAllEmployeeType() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getEmployeeType());
            }
        }
    }

    public void printAllEmployeeBonus() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getOneTimeBonus());
            }
        }
    }

    public void showAllPensionTax() {
        for (Employee employee : employeeArray) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getSurname() + " " + employee.getPensionTax());
            }
        }
    }

}
