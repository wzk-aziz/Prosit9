public class Main {
    public static void main(String[] args) {
        // Create a SocieteArrayList instance
        SocieteArrayList societe = new SocieteArrayList();

        // Add employees
        Employe employe1 = new Employe(1, "Doe", "John", 3);
        Employe employe2 = new Employe(2, "Smith", "Jane", 2);
        Employe employe3 = new Employe(3, "Johnson", "Bob", 1);

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        // Display employees
        System.out.println("List of employees:");
        societe.displayEmploye();

        // Search for an employee by name
        String searchName = "Doe";
        boolean isFound = societe.rechercherEmploye(searchName);
        System.out.println("Employee with name " + searchName + " found: " + isFound);

        // Search for an employee by object
        boolean isFoundByObject = societe.rechercherEmploye(employe2);
        System.out.println("Employee found by object: " + isFoundByObject);

        // Sort employees by ID
        societe.trierEmployeParId();
        System.out.println("\nList of employees after sorting by ID:");
        societe.displayEmploye();

        // Sort employees by name, department, and grade
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nList of employees after sorting by Name, Department, and Grade:");
        societe.displayEmploye();

        // Remove an employee
        societe.supprimerEmploye(employe1);
        System.out.println("\nList of employees after removing an employee:");
        societe.displayEmploye();
    }
}
