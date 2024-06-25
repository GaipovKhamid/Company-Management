public class CompanuManagement {

    private PermanentEmployee[] permanentEmployeeArray = new PermanentEmployee[10];
    private int permanentindex = 0;

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
}
