public class SeasonalEmployee extends Employee {
    private String season;

    public SeasonalEmployee() {
    }

    public SeasonalEmployee(String name, String surname, double salary, String work, String season) {
        super(name, surname, salary, work);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


}
