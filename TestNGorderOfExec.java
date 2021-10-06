package uk.axone.testngbasics;

import org.testng.annotations.Test;

/**
 * @author Karthik.Gandhinathan
 */
public class TestNGorderOfExec {

    @Test
    public void dologinTest(){
        System.out.println("Login Test");
    }


    @Test
    public void verifyHomePageTest(){
        System.out.println("Home Page Test");
    }


    @Test
    public void logoutTest(){
        System.out.println("logout Test");
    }

}
