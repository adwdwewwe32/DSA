class Bank {
    static double totalAmount = 0;

    String bankName;
    double depositAmount;

    void setBankName(String name) {
        bankName = name;
    }

    void setAmount(double amount) {
        if (amount >= 1000) {
            depositAmount = amount;
            totalAmount += amount;
        } else {
            System.out.println("Minimum deposit amount is 1000.");
        }
    }

    void showData() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
    }

    static void displayTotalAmount() {
        System.out.println("Total Amount deposited by the person across all banks: " + totalAmount);
    }

    static void displayMinimumDepositBank(Bank[] banks) {
        String minDepositBank = null;
        double minDepositAmount = Double.POSITIVE_INFINITY;
        for (Bank bank : banks) {
            if (bank.depositAmount < minDepositAmount) {
                minDepositAmount = bank.depositAmount;
                minDepositBank = bank.bankName;
            }
        }
        System.out.println("Bank with minimum deposit amount: " + minDepositBank);
    }
}

public class Ha_3{
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];
        for (int i = 0; i < 5; i++) {
            banks[i] = new Bank();
        }
        banks[0].setBankName("Bank A");
        banks[0].setAmount(2000);
        banks[1].setBankName("Bank B");
        banks[1].setAmount(2000);
        banks[2].setBankName("Bank C");
        banks[2].setAmount(2000);
        banks[3].setBankName("Bank D");
        banks[3].setAmount(2000);
        banks[4].setBankName("Bank E");
        banks[4].setAmount(2000);
        for (Bank bank : banks) {
            bank.showData();
        }
        Bank.displayTotalAmount();
        Bank.displayMinimumDepositBank(banks);
    }
}
