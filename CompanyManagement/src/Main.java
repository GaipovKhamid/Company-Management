public class Main {
    public static void main(String[] args) {
        CompanuManagement companuManagement = new CompanuManagement();
        companuManagement.addPermanentEmployee("Khamid", "Gaipov", 1200d, "IT", "3");

        companuManagement.addSeasonalEmployee("Khamid", "Gaipov", 1200d, "Gardener", "Spring");

        companuManagement.addPartnerEmployee("Jumong", "Lattayev", 100d, "Chang artadi", "JumongDev");

        companuManagement.addEarEmployee("Ali", "Valiyev",120d, "EAR");

//        companuManagement.printAllEmployeeDetail();
//        companuManagement.printAllEmployeeType();
//        companuManagement.printAllEmployeeBonus();
//        companuManagement.showAllPensionTax();
//        companuManagement.showInsuranceTax();
        companuManagement.showAllInsuranceTax();
    }
}