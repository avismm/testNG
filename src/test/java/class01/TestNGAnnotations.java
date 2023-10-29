package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @Test(groups = "regression")
    public void ATest(){
        System.out.println("I am the first test case");
    }

    @Test
    public void BTest(){
        System.out.println("I am the second test case");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("I am after method");
    }
}
