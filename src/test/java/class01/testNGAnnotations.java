package class01;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {
    //first test case
    @Test
    public void FirstTestCase() {
        System.out.println("I am a first test case");
    }
    @Test
    public void SecondTestCase() {
        System.out.println("I am a second test case");
    }
    @Test
    public void ThirdTestCase() {
        System.out.println("I am a third test case");
        //System.out.println(4/0); will give error by Zero
    }
    @Test
    public void FourthTestCase(){
        System.out.println("I am a fourth test case");
}
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am a Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am an After Method");
    }
}
