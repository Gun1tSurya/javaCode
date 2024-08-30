package functionalInterface;

public class Account {
    private InterestCalculator interestCalculator;

    public InterestCalculator getInterestCalculator() {
        return interestCalculator;
    }

    public void setInterestCalculator(InterestCalculator interestCalculator) {
        this.interestCalculator = interestCalculator;
    }
}
