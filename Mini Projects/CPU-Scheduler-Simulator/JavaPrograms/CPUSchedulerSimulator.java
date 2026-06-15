import java.util.Scanner;

public class CPUSchedulerSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n===== CPU Scheduler Simulator =====");

            System.out.println("1. FCFS");
            System.out.println("2. SJF");
            System.out.println("3. Priority Scheduling");
            System.out.println("4. Round Robin");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("FCFS Selected");
                    System.out.println("Execution Order: P1 -> P2 -> P3");
                    break;

                case 2:
                    System.out.println("SJF Selected");
                    System.out.println("Execution Order: P2 -> P3 -> P1");
                    break;

                case 3:
                    System.out.println("Priority Scheduling Selected");
                    System.out.println("Execution Order: P2 -> P4 -> P1 -> P3");
                    break;

                case 4:
                    System.out.println("Round Robin Selected");
                    System.out.println("Execution Order: P1 -> P2 -> P3 -> P1");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
