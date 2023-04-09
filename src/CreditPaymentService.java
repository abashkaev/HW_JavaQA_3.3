public class CreditPaymentService {
    public double calculate(double creditPercent, int termCredit, double amountCredit) {
        double mountCreditPercent = creditPercent / 1200;
        double payPerMount = amountCredit * (mountCreditPercent + (mountCreditPercent / (Math.pow(1 + mountCreditPercent, termCredit) - 1)));
        return payPerMount;
    }
}
