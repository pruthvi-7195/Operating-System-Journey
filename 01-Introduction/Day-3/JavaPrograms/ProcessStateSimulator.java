public class ProcessStateSimulator {

    public static void main(String[] args) {

        System.out.println("Process Created");
        System.out.println("State : NEW");

        System.out.println();

        System.out.println("Process moved to READY state");

        System.out.println();

        System.out.println("CPU Assigned");
        System.out.println("State : RUNNING");

        System.out.println();

        System.out.println("Waiting for I/O");
        System.out.println("State : WAITING");

        System.out.println();

        System.out.println("Back to READY");

        System.out.println();

        System.out.println("CPU Assigned Again");
        System.out.println("State : RUNNING");

        System.out.println();

        System.out.println("Execution Completed");
        System.out.println("State : TERMINATED");
    }
}
