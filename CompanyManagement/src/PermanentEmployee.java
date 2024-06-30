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

}




