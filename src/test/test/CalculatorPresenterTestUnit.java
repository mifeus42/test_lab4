import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ru.miet.testing.model.Calculator;
import ru.miet.testing.presenter.CalculatorPresenter;
import ru.miet.testing.view.CalculatorView;

public class CalculatorPresenterTestUnit {
    private CalculatorPresenter calculatorPresenter;
    private CalculatorView mockView;
    private Calculator mockCalculator;

    @Before
    public void setUp() throws Exception {
        mockView = Mockito.mock(CalculatorView.class);
        Mockito.when(mockView.getFirstArgumentAsString()).thenReturn("1");
        Mockito.when(mockView.getSecondArgumentAsString()).thenReturn("1");

        mockCalculator = Mockito.mock(Calculator.class);
        Mockito.when(mockCalculator.sum(1,1)).thenReturn(2.0);
        Mockito.when(mockCalculator.divide(1,1)).thenReturn(1.0);
        Mockito.when(mockCalculator.multiply(1,1)).thenReturn(1.0);
        Mockito.when(mockCalculator.subtract(1,1)).thenReturn(0.0);

        calculatorPresenter = new CalculatorPresenter(mockView, mockCalculator);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onPlusClicked() {
        calculatorPresenter.onPlusClicked();
        Mockito.verify(mockCalculator).sum(1,1);
        Mockito.verify(mockView).printResult(2);
    }

    @Test
    public void onMinusClicked() {
        calculatorPresenter.onMinusClicked();
        Mockito.verify(mockCalculator).subtract(1,1);
        Mockito.verify(mockView).printResult(0);
    }

    @Test
    public void onDivideClicked() {
        calculatorPresenter.onDivideClicked();
        Mockito.verify(mockCalculator).divide(1,1);
        Mockito.verify(mockView).printResult(1);
    }

    @Test
    public void onMultiplyClicked() {
        calculatorPresenter.onMultiplyClicked();
        Mockito.verify(mockCalculator).multiply(1,1);
        Mockito.verify(mockView).printResult(1);
    }

}