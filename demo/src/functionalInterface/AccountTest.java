package functionalInterface;

public class AccountTest {

    public static void main(String[] args) {

        float amount = 20000f;
        float interestRate = 5f;
        Account account = new Account();

        /*account.setInterestCalculator(new InterestCalculator() {
            @Override
            public float calculateInterest(float amount, float interestRate) {
                return amount* interestRate;
            }
        });*/

        // Below method can do the same operation in single line and result is same.
        account.setInterestCalculator((amt, inter)->(amt* inter));

        System.out.println(account.getInterestCalculator().calculateInterest(amount,interestRate));
    }
}
