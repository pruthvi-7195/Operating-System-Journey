import java.util.Arrays;

public class SJFScheduling {

    public static void main(String[] args) {

        int[] bt = {6, 2, 8, 3};

        Arrays.sort(bt);

        int[] wt = new int[bt.length];
        int[] tat = new int[bt.length];

        wt[0] = 0;

        for(int i = 1; i < bt.length; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }

        for(int i = 0; i < bt.length; i++) {
            tat[i] = wt[i] + bt[i];
        }

        System.out.println("BT\tWT\tTAT");

        for(int i = 0; i < bt.length; i++) {
            System.out.println(bt[i] + "\t" + wt[i] + "\t" + tat[i]);
        }
    }
}
