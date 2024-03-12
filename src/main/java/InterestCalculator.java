
public class InterestCalculator {
    final static int DIAS=365;
    double calculateInterest(double principal, double rate, int time) {
        // Cálculo del interés compuesto para 365 días al año
        return principal * Math.pow(1 + (rate / DIAS), time * DIAS);
    }
}

