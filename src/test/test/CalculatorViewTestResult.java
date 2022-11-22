import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.miet.testing.view.CalculatorView;

public class CalculatorViewTestResult {
    private FrameFixture calculatorViewEditor;

    @Before
    public void setUp() throws Exception {
        CalculatorView calculatorView = new CalculatorView();
        calculatorViewEditor = new FrameFixture(calculatorView);
    }

    @After
    public void tearDown() throws Exception {
        calculatorViewEditor.cleanUp();
    }

    @Test
    public void onPlusClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("plusButton").click();
        Assert.assertEquals("2.0", calculatorViewEditor.textBox("resultField").text());
    }

    @Test
    public void onMinusClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("minusButton").click();
        Assert.assertEquals("0.0", calculatorViewEditor.textBox("resultField").text());
    }

    @Test
    public void onDivideClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("divideButton").click();
        Assert.assertEquals("1.0", calculatorViewEditor.textBox("resultField").text());
    }

    @Test
    public void onMultiplyClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("multiplyButton").click();
        Assert.assertEquals("1.0", calculatorViewEditor.textBox("resultField").text());
    }
}