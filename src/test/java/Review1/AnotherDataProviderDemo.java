package Review1;

import org.testng.annotations.DataProvider;

public class AnotherDataProviderDemo {
    @DataProvider(name="loginData")
    public Object[][] data(){
        Object[][] loginData={
                {"Admin", "12345"},
                {"ABCD", "Hum@nhrm123"},
                {"Admin", ""}
        };
        return loginData;
    }
}
