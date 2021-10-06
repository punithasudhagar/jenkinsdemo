package uk.axone.testngbasics;

import org.testng.annotations.*;

/**
 * @author Karthik.Gandhinathan
 */
public class TestNGAnnotation {


    @BeforeTest
    public void beforeTest(){
        System.out.println("--@BeforeTest -- make a Database connection");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("--@AfterTest -- close the Database connection");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("----@BeforeClass -- launch the browser");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("----@AfterClass --  close the browser");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("------@BeforeMethod -- Navigate to the AUT and login to the application");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("------@AfterMethod -- Logout from the application");
    }

    @Test
    public void myFirstTest(){
        System.out.println("shopping cart test");
    }

    @Test
    public void mySecondTest(){
        System.out.println("Edit the cart test");
    }

    @Test
    public void myThirdTest(){
        System.out.println("Checkout test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite -- Make a connection to Messaging Queue and inject test data");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("@AfterSuite -- Release connection to Messaging Queue and inject test data");
    }



}
