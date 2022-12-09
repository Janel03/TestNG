package class01;
import org.testng.annotations.Test;
public class enableDisable {
        @Test(enabled = false)//will not run with enabled=false
        public void Atest(){
            System.out.println("I am an A test");
        }
        @Test
        public  void BTest(){
            System.out.println("I am a B test");
        }
        @Test(enabled = false)
        public  void CTest(){
            System.out.println("I am a C test");
        }
}
