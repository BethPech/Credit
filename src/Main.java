public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 12, 9.99F);
        System.out.println(payment);
        payment = service.calculate(1_000_000, 24, 9.99F);
        System.out.println(payment);
        payment = service.calculate(1_000_000, 36, 9.99F);
        System.out.println(payment);
    }
}
