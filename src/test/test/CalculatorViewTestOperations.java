import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import ru.miet.testing.presenter.CalculatorPresenter;
import ru.miet.testing.view.CalculatorView;

public class CalculatorViewTestOperations {
    private FrameFixture calculatorViewEditor;
    private CalculatorPresenter mock;

    @Before
    public void setUp() throws Exception {
        mock = Mockito.mock(CalculatorPresenter.class);
        CalculatorView calculatorView = new CalculatorView();
        calculatorView.setCalculatorPresenter(mock);
        calculatorViewEditor = new FrameFixture(calculatorView);
    }

    @After
    public void tearDown() throws Exception {
        calculatorViewEditor.cleanUp();
    }

    @Test
    public void onPlusClicked() {
        calculatorViewEditor.button("plusButton").click();
        Mockito.verify(mock).onPlusClicked();
    }

    @Test
    public void onMinusClicked() {
        calculatorViewEditor.button("minusButton").click();
        Mockito.verify(mock).onMinusClicked();
    }

    @Test
    public void onDivideClicked() {
        calculatorViewEditor.button("divideButton").click();
        Mockito.verify(mock).onDivideClicked();
    }

    @Test
    public void onMultiplyClicked() {
        calculatorViewEditor.button("multiplyButton").click();
        Mockito.verify(mock).onMultiplyClicked();
    }
}