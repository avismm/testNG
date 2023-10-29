package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
    //if the priority is not set, testNG shall use the alphabetical order by default
    //the highest priority is zero

    @Test(priority = 2, groups = "regression")
    public void Atest(){
        System.out.println("I am testA");
    }

    @Test(priority = 1)
    public void Ctest(){
        System.out.println("I am testC");
    }

    @Test(priority = 3)
    public void Btest(){
        System.out.println("I am testB");
    }

    @Test
    public void Dtest(){
        System.out.println("I am testD");
    }

}
