public class CreditPaymentService {
    public double calculate(float sum, float term, float percent) {
        float i = percent / term / 100;
        float a = 1 + i;
        double b = Math.pow(a, term);
        double coefficient = i * b / (b - 1);
        return coefficient * sum;
    }
}
