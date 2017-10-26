/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac
 */
public class EmployeeTest {
    private Employee e;
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
        e = new Employee();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void firstNameGoodValuesShoubBeAccepted() {
        String[] goodValues = {"Bob", "B", "BBBBBBoooooooooobbbbbbbbbbbbbyyyyyyyyyy", "1", "A1", "Bob A Lu"};
        for(String v : goodValues){
            e.setFirstName(v);
        }
    }
    
    @Test
    public void firstNameLengthShouldBeEven() {
        e.setFirstName("Pete");
        assertTrue(e.isFirstNameLengthEven());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void firstNameWithSpacesShouldThrowException() {
        e.setFirstName("Bob A Lu");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void firstNameEmptyShouldThrowException() {
        e.setFirstName(null);
    }

    /**
     * Test of getDaysVacation method, of class Employee.
     */
    @Test(expected = IllegalArgumentException.class)
    public void firstNameNullShouldThrowException() {
        e.setFirstName(null);
    }
}