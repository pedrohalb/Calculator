public class Calculator {

    public int add(int v1, int v2) {
        return v1 + v2;
    }

    public double divide(int v1, int v2) {
        if (v2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return (double) v1 / v2;
    }

    public int subtract(int v1, int v2) {
        return v1 - v2;
    }

    public int multiply(int v1, int v2) {
        return v1 * v2;
    }
}