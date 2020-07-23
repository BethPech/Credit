public class CreditPaymentService {
    public double calculate(double sum, double term, double percent) {
        double i = percent / 12 / 100;
        double a = 1 + i;
        double b = Math.pow(a, term);
        double coefficient = i * b / (b - 1);
        return coefficient * sum;
    }
}
