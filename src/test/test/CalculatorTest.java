import org.junit.Assert;
import org.junit.Test;
import ru.miet.testing.model.Calculator;

public class CalculatorTest {

    @Test
    public void sum() {
        int firstValue = 1;
        int secondValue = 2;
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.sum(firstValue,secondValue), 3, 10e-7);
    }

    @Test
    public void subtract() {
        int firstValue = 1;
        int secondValue = 2;
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.subtract(firstValue,secondValue), -1, 10e-7);
    }

    @Test
    public void multiply() {
        int firstValue = 1;
        int secondValue = 2;
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.multiply(firstValue,secondValue), 2, 10e-7);
    }

    @Test
    public void divide() {
        int firstValue = 1;
        int secondValue = 2;
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.divide(firstValue,secondValue), 0.5, 10e-7);
    }

    @Test (expected = ArithmeticException.class)
    public void divideThrowArithmeticException() {
        int firstValue = 1;
        int secondValue = 0;
        Calculator calculator = new Calculator();

        calculator.divide(firstValue,secondValue);
    }
}