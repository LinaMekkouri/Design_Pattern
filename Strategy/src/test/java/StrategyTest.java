import static org.junit.Assert.*;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void testConcreteStrategyA() {
        Strategy strategy = new ConcreteStrategyA();
        assertEquals("Expected output for ConcreteStrategyA", "Executing ConcreteStrategyA", getOutput(strategy));
    }

    @Test
    public void testConcreteStrategyB() {
        Strategy strategy = new ConcreteStrategyB();
        assertEquals("Expected output for ConcreteStrategyB", "Executing ConcreteStrategyB", getOutput(strategy));
    }

    private String getOutput(Strategy strategy) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        strategy.execute();
        return outContent.toString().trim();
    }
}
