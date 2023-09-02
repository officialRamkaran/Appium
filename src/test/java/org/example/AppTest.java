package org.example;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @BeforeClass
    public void setup() {
        System.out.println("<<<<<<<<<<< try to setup >>>>>>>>>>>>>>>>>>>>>");

    }
    @Test
    public void testLogin(){
        System.out.println("<<<<<<<<<<< Login test pass >>>>>>>>>>>>>>>>>>>>>");
    }

    @AfterClass
    public void closeSession(){
        System.out.println("<<<<<<<<<<< Session close >>>>>>>>>>>>>>>>>>>>>");
    }
}
