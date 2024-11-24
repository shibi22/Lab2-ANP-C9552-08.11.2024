// Abstract class
abstract class Vaccine {
    int age;
    String nationality;

    // Constructor to initialize variables
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete methods
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose taken successfully. Please pay 250 Rs.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("Second dose taken successfully.");
        } else {
            System.out.println("You need to complete the first dose before taking the second dose.");
        }
    }

    // Abstract method
    public abstract void boosterDose();
}

// Implementation class
class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("Booster dose taken successfully.");
    }
}

// Main class
public class Vaccination {
    public static void main(String[] args) {
        // Create a vaccination object with age and nationality
        VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");

        // Scenario 1: First dose
        System.out.println("Checking eligibility for the first dose:");
        user.firstDose();

        // Assume the user has completed the first dose
        boolean firstDoseCompleted = true;

        // Scenario 2: Second dose
        System.out.println("\nChecking eligibility for the second dose:");
        user.secondDose(firstDoseCompleted);

        // Scenario 3: Booster dose
        System.out.println("\nTaking the booster dose:");
        user.boosterDose();
    }
}
