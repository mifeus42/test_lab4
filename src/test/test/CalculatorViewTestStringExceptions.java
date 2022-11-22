import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.miet.testing.view.CalculatorView;

public class CalculatorViewTestStringExceptions {
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
    public void onPlusClickedWFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("s");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("plusButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }
    @Test
    public void onPlusClickedWSecondStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("s");
        calculatorViewEditor.button("plusButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }

    @Test
    public void onMinusClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("s");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("minusButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }
    @Test
    public void onMinusClickedSecondStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("s");
        calculatorViewEditor.button("minusButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }

    @Test
    public void onDivideClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("s");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("divideButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }
    @Test
    public void onDivideClickedSecondStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("s");
        calculatorViewEditor.button("divideButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }

    @Test
    public void onMultiplyClickedFirstStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("s");
        calculatorViewEditor.textBox("secondValueField").enterText("1");
        calculatorViewEditor.button("multiplyButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }
    @Test
    public void onMultiplyClickedSecondStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("s");
        calculatorViewEditor.button("multiplyButton").click();
        Assert.assertEquals("Exception. Try again", calculatorViewEditor.textBox("resultField").text());
    }
}