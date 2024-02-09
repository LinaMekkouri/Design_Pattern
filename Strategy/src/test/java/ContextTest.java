import static org.junit.Assert.*;
import org.junit.Test;

public class ContextTest {

    @Test
    public void testContextWithStrategyA() {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(strategy);
        assertEquals("Expected output for ConcreteStrategyA", "Executing ConcreteStrategyA", getOutput(context));
    }

    @Test
    public void testContextWithStrategyB() {
        Strategy strategy = new ConcreteStrategyB();
        Context context = new Context();
        context.setStrategy(strategy);
        assertEquals("Expected output for ConcreteStrategyB", "Executing ConcreteStrategyB", getOutput(context));
    }

    private String getOutput(Context context) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        context.executeStrategy();
        return outContent.toString().trim();
    }
}
