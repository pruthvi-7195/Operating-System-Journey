import java.util.Scanner;

public class SystemCallSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== System Call Simulation ===");

        System.out.println("1. Open File");
        System.out.println("2. Read File");
        System.out.println("3. Create Process");
        System.out.println("4. Allocate Memory");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("System Call: Opening File...");
                break;

            case 2:
                System.out.println("System Call: Reading File...");
                break;

            case 3:
                System.out.println("System Call: Creating Process...");
                break;

            case 4:
                System.out.println("System Call: Allocating Memory...");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
