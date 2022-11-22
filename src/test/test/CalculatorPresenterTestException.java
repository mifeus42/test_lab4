import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ru.miet.testing.model.Calculator;
import ru.miet.testing.presenter.CalculatorPresenter;
import ru.miet.testing.view.CalculatorView;
import org.mockito.Mockito;

public class CalculatorPresenterTestException {
    private CalculatorPresenter calculatorPresenter;
    private CalculatorView mockView;
    private Calculator mockCalculator;

    @Before
    public void setUp() throws Exception {
        mockView = Mockito.mock(CalculatorView.class);
        Mockito.when(mockView.getFirstArgumentAsString()).thenReturn("1");

        mockCalculator = Mockito.mock(Calculator.class);
        Mockito.when(mockCalculator.divide(1,0)).thenThrow(new ArithmeticException());
        calculatorPresenter = new CalculatorPresenter(mockView, mockCalculator);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onPlusClickedException() {
        Mockito.when(mockView.getSecondArgumentAsString()).thenReturn("s");
        calculatorPresenter.onPlusClicked();
        Mockito.verify(mockView).displayError("Exception. Try again");
    }

    @Test
    public void onMinusClickedException() {
        Mockito.when(mockView.getSecondArgumentAsString()).thenReturn("s");
        calculatorPresenter.onMinusClicked();
        Mockito.verify(mockView).displayError("Exception. Try again");
    }

    @Test
    public void onDivideClickedException() {
        Mockito.when(mockView.getSecondArgumentAsString()).thenReturn("s");
        calculatorPresenter.onDivideClicked();
        Mockito.verify(mockView).displayError("Exception. Try again");
    }

    @Test
    public void onMultiplyClickedException() {
        Mockito.when(mockView.getSecondArgumentAsString()).thenReturn("s");
        calculatorPresenter.onMultiplyClicked();
        Mockito.verify(mockView).displayError("Exception. Try again");
    }

    @Test
    public void onDivideClickedArithmeticException() {
        Mockito.when(mockView.getSecondArgumentAsString()).thenReturn("0");
        calculatorPresenter.onDivideClicked();
        Mockito.verify(mockView).displayError("Exception. Divide 0");
    }

}