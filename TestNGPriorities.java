package uk.axone.testngbasics;

import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestNGPriorities {

    @Test(priority = 0)
    public void loginTest(){
        System.out.println("Login Test");
    }


    @Test(priority = 1)
    public void verifyHomePageTest(){
        System.out.println("Home Page Test");
    }


    @Test(priority = 2)
    public void logoutTest(){
        System.out.println("logout Test");
    }
}
