public class Main {
    public static void main(String[] args) {
        CompanuManagement companuManagement = new CompanuManagement();
        companuManagement.addPermanentEmployee("Khamid", "Gaipov", 1200d, "IT", "3");
        companuManagement.addPermanentEmployee("Khamid", "Gaipov", 1200d, "IT", "3");

        companuManagement.addSeasonalEmployee("Khamid", "Gaipov", 1200d, "Gardener", "Spring");

        companuManagement.addTemporaryEmployee("Khamid", "Gaipov", 1200d, "don`t know", "3");
        companuManagement.addTemporaryEmployee("Khamid", "Gaipov", 1200d, "don`t know", "3");

//        companuManagement.printAllEmployeeDetail();
//        companuManagement.printAllEmployeeType();
//        companuManagement.printAllEmployeeBonus();
//        companuManagement.showAllPensionTax();
        companuManagement.showInsuranceTax();
    }
}