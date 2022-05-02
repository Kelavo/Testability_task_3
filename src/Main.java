public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthly_paymentA = service.calculate(1000000, 1);

        System.out.println(monthly_paymentA);
    }
}
