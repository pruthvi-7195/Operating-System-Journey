public class RoundRobinScheduling {

    public static void main(String[] args) {

        int[] burstTime = {5, 4, 2};
        int quantum = 2;

        int n = burstTime.length;
        int[] remaining = burstTime.clone();

        boolean done;

        System.out.println("Execution Order:");

        do {
            done = true;

            for (int i = 0; i < n; i++) {

                if (remaining[i] > 0) {

                    done = false;

                    if (remaining[i] > quantum) {

                        System.out.println(
                            "P" + (i + 1) +
                            " executes for " + quantum + " units"
                        );

                        remaining[i] -= quantum;

                    } else {

                        System.out.println(
                            "P" + (i + 1) +
                            " executes for " + remaining[i] +
                            " units and completes"
                        );

                        remaining[i] = 0;
                    }
                }
            }

        } while (!done);
    }
}
