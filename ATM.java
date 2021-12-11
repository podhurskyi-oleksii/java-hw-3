public class ATM {
    public int countBanknotes(int sum) {

        int[] nominal = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while(sum > 0) {
            if (sum >= nominal[i]) {
                count += sum / nominal[i];
                sum %= nominal[i];
            }
            i++;
        }
        return count;
    }
}
