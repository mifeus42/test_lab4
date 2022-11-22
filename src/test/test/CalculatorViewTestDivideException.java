import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.miet.testing.view.CalculatorView;

public class CalculatorViewTestDivideException {
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
    public void onDivideClickedStringValue() {
        calculatorViewEditor.textBox("firstValueField").enterText("1");
        calculatorViewEditor.textBox("secondValueField").enterText("0");
        calculatorViewEditor.button("divideButton").click();
        Assert.assertEquals("Exception. Divide 0", calculatorViewEditor.textBox("resultField").text());
    }

}