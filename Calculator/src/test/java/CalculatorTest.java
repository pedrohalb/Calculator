import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("#add > When both numbers are positive > Return a positive number")
    void addWhenBothNumbersArePositiveReturnAPositiveNumber() {
        int result = calculator.add(3,4);
        Assertions.assertEquals(7, result);
    }

    @Test
    void addWhenBothNumbersAreNegativeReturnANegativeNumber() {
        int result = calculator.add(-3, -4);
        Assertions.assertEquals(-7, result);
    }

    @Test
    void addWhenOneNumberIsPositiveAndTheAnotherIsNegativeReturnAPositiveNumber() {
        int result = calculator.add(-3, 4);
        Assertions.assertEquals(1, result);
    }

    @Test
    void addWhenOneNumberIsPositiveAndTheAnotherIsNegativeReturnANegativeNumber() {
        int result = calculator.add(3, -4);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void addWhenOneNumberIsZeroReturnTheGivenNumber() {
        int result = calculator.add(3, 0);
        int secondResult = calculator.add(0, 4);
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, result),
                () -> Assertions.assertEquals(4, secondResult)
        );
    }

    @Test
    void addWhenOneNumberIsNegativeAndTheAnotherIsZeroReturnTheGivenNumber() {
        int result = calculator.add(-3, 0);
        int secondResult = calculator.add(0, -4);
        Assertions.assertAll(
                () -> Assertions.assertEquals(-3, result),
                () -> Assertions.assertEquals(-4, secondResult)
        );
    }

    @Test
    @DisplayName("#dividir > Quando o divisor é zero > Lançar uma exceção")
    void divideWhenTheDividerIsZeroThrowAnException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    @DisplayName("#dividir > Ao dividir dois números positivos > Retornar um resultado fracionário")
    void divideTwoPositiveNumbersReturnFractionalResult() {
        double result = calculator.divide(5, 2);
        Assertions.assertEquals(2.5, result, 0.0001); // Utilizamos delta para comparar números de ponto flutuante
    }

    @Test
    @DisplayName("#dividir > Ao dividir um número positivo por um número negativo > Retornar um resultado fracionário")
    void dividePositiveByNegativeReturnFractionalResult() {
        double result = calculator.divide(7, -3);
        Assertions.assertEquals(-2.3333, result, 0.0001);
    }

    @Test
    @DisplayName("#dividir > Ao dividir um número negativo por um número positivo > Retornar um resultado fracionário")
    void divideNegativeByPositiveReturnFractionalResult() {
        double result = calculator.divide(-8, 4);
        Assertions.assertEquals(-2.0, result, 0.0001);
    }

    @Test
    @DisplayName("#dividir > Ao dividir dois números negativos > Retornar um resultado fracionário")
    void divideTwoNegativeNumbersReturnFractionalResult() {
        double result = calculator.divide(-6, -2);
        Assertions.assertEquals(3.0, result, 0.0001);
    }

    @Test
    @DisplayName("#dividir > Ao dividir por zero > Lançar uma exceção")
    void divideByZeroThrowException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
    }

    @Test
    @DisplayName("#subtrair > Ao subtrair dois números positivos > Retornar o resultado correto")
    void subtractTwoPositiveNumbers() {
        double result = calculator.subtract(5, 2);
        Assertions.assertEquals(3.0, result, 0.0001);
    }

    @Test
    @DisplayName("#subtrair > Ao subtrair um número positivo de um número negativo > Retornar o resultado correto")
    void subtractPositiveFromNegative() {
        double result = calculator.subtract(-7, 3);
        Assertions.assertEquals(-10.0, result, 0.0001);
    }

    @Test
    @DisplayName("#subtrair > Ao subtrair um número negativo de um número positivo > Retornar o resultado correto")
    void subtractNegativeFromPositive() {
        double result = calculator.subtract(8, -4);
        Assertions.assertEquals(12.0, result, 0.0001);
    }

    @Test
    @DisplayName("#subtrair > Ao subtrair dois números negativos > Retornar o resultado correto")
    void subtractTwoNegativeNumbers() {
        double result = calculator.subtract(-6, -2);
        Assertions.assertEquals(-4.0, result, 0.0001);
    }

    // Testes para o método multiply

    @Test
    @DisplayName("#multiplicar > Ao multiplicar dois números positivos > Retornar o resultado correto")
    void multiplyTwoPositiveNumbers() {
        double result = calculator.multiply(5, 2);
        Assertions.assertEquals(10.0, result, 0.0001);
    }

    @Test
    @DisplayName("#multiplicar > Ao multiplicar um número positivo por um número negativo > Retornar o resultado correto")
    void multiplyPositiveByNegative() {
        double result = calculator.multiply(7, -3);
        Assertions.assertEquals(-21.0, result, 0.0001);
    }

    @Test
    @DisplayName("#multiplicar > Ao multiplicar um número negativo por um número positivo > Retornar o resultado correto")
    void multiplyNegativeByPositive() {
        double result = calculator.multiply(-8, 4);
        Assertions.assertEquals(-32.0, result, 0.0001);
    }

    @Test
    @DisplayName("#multiplicar > Ao multiplicar dois números negativos > Retornar o resultado correto")
    void multiplyTwoNegativeNumbers() {
        double result = calculator.multiply(-6, -2);
        Assertions.assertEquals(12.0, result, 0.0001);
    }
}