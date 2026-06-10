import java.util.Arrays;

class Process implements Comparable<Process> {

    int pid;
    int burstTime;
    int priority;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    public int compareTo(Process p) {
        return this.priority - p.priority;
    }
}

public class PriorityScheduling {

    public static void main(String[] args) {

        Process[] processes = {
            new Process(1, 5, 3),
            new Process(2, 3, 1),
            new Process(3, 8, 4),
            new Process(4, 2, 2)
        };

        Arrays.sort(processes);

        System.out.println("Execution Order:");

        for(Process p : processes) {
            System.out.println("P" + p.pid +
                    " Priority = " + p.priority);
        }
    }
}
