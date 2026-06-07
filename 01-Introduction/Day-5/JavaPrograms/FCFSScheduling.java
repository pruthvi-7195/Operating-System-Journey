public class FCFSScheduling {

    public static void main(String[] args) {

        int[] bt = {5, 3, 8};
        int n = bt.length;

        int[] wt = new int[n];
        int[] tat = new int[n];

        wt[0] = 0;

        for(int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }

        for(int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }

        System.out.println("Process\tBT\tWT\tTAT");

        for(int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1)
                    + "\t" + bt[i]
                    + "\t" + wt[i]
                    + "\t" + tat[i]);
        }
    }
}
