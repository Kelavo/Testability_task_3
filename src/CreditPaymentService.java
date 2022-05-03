public class CreditPaymentService {
    public double calculate(int amount, int term) {
        int years = term * 12;
        float creditRate = 9.99F / 12 / 100;
        double coefficientA = creditRate * (Math.pow(1 + creditRate, years) / (Math.pow(1 + creditRate, years) - 1));
        double monthlyPayment = coefficientA * amount;
        return (double) monthlyPayment;
    }
}
