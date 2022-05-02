public class CreditPaymentService {
    public double calculate(int amount, int term) {

        int years = term * 12;
        float credit_rate = 9.99F / 12 / 100;

        double coefficientA = credit_rate * (Math.pow(1 + credit_rate, years) / (Math.pow(1 + credit_rate, years) - 1));

        double monthly_payment = coefficientA * amount;

        return (double) monthly_payment;
    }

}
