package class01;
import org.testng.annotations.Test;
public class dependsOn {
    @Test
    public void Login(){
       // System.out.println(6/0); will fail this TestCase
        //System.out.println(4/0);
        System.out.println("I have logged in successfully");
    }
    @Test(dependsOnMethods = {"Login"})//this will only run if Login passes
    public  void DashBoardVerification(){

        System.out.println("After login I am verifying the dashboard page");
    }
}
