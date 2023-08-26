package WAFILIFE.Automation_QA;
import org.testng.annotations.Factory;

public class TestFactory {

    @Factory
    public Object[] createInstances() {
        Object[] result = new Object[2]; // Number of browser instances
        
        // First instance for Firefox
        result[0] = new QA_Automation_Of_WafiLife("firefox");
        
        // Second instance for Chrome
        result[1] = new QA_Automation_Of_WafiLife("edge");
        
        return result;
    }
}