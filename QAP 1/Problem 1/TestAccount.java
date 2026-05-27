public class TestAccount {

    public static void main(String[] args) {

        // Create two accounts
        Account acc1 =
                new Account("A1001", 5000);

        Account acc2 =
                new Account("A1002", 4000);

        // Display initial balances
        System.out.println("Initial Balances:");
        System.out.println("Acc1: $" +
                acc1.getBalance());

        System.out.println("Acc2: $" +
                acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transfer(acc2, 1000);

        // Display final balances
        System.out.println("\nAfter Transfer:");

        System.out.println("Acc1: $" +
                acc1.getBalance());

        System.out.println("Acc2: $" +
                acc2.getBalance());
    }
}