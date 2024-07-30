package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkForBankAccount()
    {
        BankAccount b = new BankAccount(1, "Anu", 100, false);
        assertNotNull("Unable to create Account",b);
        assertTrue( true );
        
    }

    @Test
    public void checkForName(){
        BankAccount b = new BankAccount(null, null, null, null);
        assertNull("The instance is created",b.getName());
    }  

    @Test
    public void checkForInstance(){
        BankAccount b = new BankAccount(2, "Jhansi", 450);
        BankAccount c = b;
        assertEquals( b, c);
    }

    @Test
    public void checkTransfer(){
        BankAccount b = new BankAccount(2, "Jhansi", 450);
        BankAccount c = new BankAccount(1, "B", 200);
        assertNotNull("Invalid balance",b.transfer(200, c));

    }

}
