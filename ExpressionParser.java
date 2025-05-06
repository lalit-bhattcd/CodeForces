import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionParser {
    public static void main(String[] args) {
        String expression = "10 + 5 * 2 - 3 / 3"; // Expected result: 19

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            Object result = engine.eval(expression);
            System.out.println("Result: " + result); // Output: 19
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
