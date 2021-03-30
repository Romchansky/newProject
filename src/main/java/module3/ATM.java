package module3;

public class ATM {
    public int countBanknotes(int sum) {
        int[] banknoteBank = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int counterLoop = 0;
        int banknote = 0;
        while (counterLoop < banknoteBank.length) {
            banknote += sum / banknoteBank[counterLoop];
            sum %= banknoteBank[counterLoop];
            counterLoop++;
        }
        return banknote;
    }

    public static void main(String[] args) {

        System.out.println(new ATM().countBanknotes(578));
    }
}

