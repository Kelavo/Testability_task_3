public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPaymentA = service.calculate(1000000, 1);
        System.out.println(monthlyPaymentA);
    }
}
