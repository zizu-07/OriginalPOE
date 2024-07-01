/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package rc;

import java.util.regex.Pattern;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskIT {
    
    public TaskIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Task.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Task.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisteredUsername method, of class Task.
     */
    @Test
    public void testGetRegisteredUsername() {
        System.out.println("getRegisteredUsername");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getRegisteredUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegisteredPassword method, of class Task.
     */
    @Test
    public void testGetRegisteredPassword() {
        System.out.println("getRegisteredPassword");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getRegisteredPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginUsername method, of class Task.
     */
    @Test
    public void testGetLoginUsername() {
        System.out.println("getLoginUsername");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getLoginUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginPassword method, of class Task.
     */
    @Test
    public void testGetLoginPassword() {
        System.out.println("getLoginPassword");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getLoginPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class Task.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidTwo method, of class Task.
     */
    @Test
    public void testIsValidTwo() {
        System.out.println("isValidTwo");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.isValidTwo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidThree method, of class Task.
     */
    @Test
    public void testIsValidThree() {
        System.out.println("isValidThree");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.isValidThree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegex method, of class Task.
     */
    @Test
    public void testGetRegex() {
        System.out.println("getRegex");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getRegex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPattern method, of class Task.
     */
    @Test
    public void testGetPattern() {
        System.out.println("getPattern");
        Task instance = new Task();
        Pattern expResult = null;
        Pattern result = instance.getPattern();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Task.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Task instance = new Task();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Task.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Task instance = new Task();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisteredUsername method, of class Task.
     */
    @Test
    public void testSetRegisteredUsername() {
        System.out.println("setRegisteredUsername");
        String registeredUsername = "";
        Task instance = new Task();
        instance.setRegisteredUsername(registeredUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegisteredPassword method, of class Task.
     */
    @Test
    public void testSetRegisteredPassword() {
        System.out.println("setRegisteredPassword");
        String registeredPassword = "";
        Task instance = new Task();
        instance.setRegisteredPassword(registeredPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginUsername method, of class Task.
     */
    @Test
    public void testSetLoginUsername() {
        System.out.println("setLoginUsername");
        String loginUsername = "";
        Task instance = new Task();
        instance.setLoginUsername(loginUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginPassword method, of class Task.
     */
    @Test
    public void testSetLoginPassword() {
        System.out.println("setLoginPassword");
        String loginPassword = "";
        Task instance = new Task();
        instance.setLoginPassword(loginPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValid method, of class Task.
     */
    @Test
    public void testSetValid() {
        System.out.println("setValid");
        boolean valid = false;
        Task instance = new Task();
        instance.setValid(valid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValidTwo method, of class Task.
     */
    @Test
    public void testSetValidTwo() {
        System.out.println("setValidTwo");
        boolean validTwo = false;
        Task instance = new Task();
        instance.setValidTwo(validTwo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValidThree method, of class Task.
     */
    @Test
    public void testSetValidThree() {
        System.out.println("setValidThree");
        boolean validThree = false;
        Task instance = new Task();
        instance.setValidThree(validThree);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegex method, of class Task.
     */
    @Test
    public void testSetRegex() {
        System.out.println("setRegex");
        String regex = "";
        Task instance = new Task();
        instance.setRegex(regex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Task.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String registeredUsername = "";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkUserName(registeredUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Task.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String registeredPassword = "";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(registeredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Task.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Task instance = new Task();
        instance.registerUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Task.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.loginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Task.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        Task instance = new Task();
        instance.returnLoginStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Task.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskName method, of class Task.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getTaskName();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescs method, of class Task.
     */
    @Test
    public void testGetTaskDescs() {
        System.out.println("getTaskDescs");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getTaskDescs();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloperDetail method, of class Task.
     */
    @Test
    public void testGetDeveloperDetail() {
        System.out.println("getDeveloperDetail");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getDeveloperDetail();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Task.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getDuration();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Task.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class Task.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOption method, of class Task.
     */
    @Test
    public void testGetOption() {
        System.out.println("getOption");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getOption();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChoice method, of class Task.
     */
    @Test
    public void testGetChoice() {
        System.out.println("getChoice");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getChoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Task.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Task instance = new Task();
        int[] expResult = null;
        int[] result = instance.getStatus();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class Task.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        Task instance = new Task();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskName method, of class Task.
     */
    @Test
    public void testSetTaskName() {
        System.out.println("setTaskName");
        String[] taskName = null;
        Task instance = new Task();
        instance.setTaskName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDescs method, of class Task.
     */
    @Test
    public void testSetTaskDescs() {
        System.out.println("setTaskDescs");
        String[] taskDescs = null;
        Task instance = new Task();
        instance.setTaskDescs(taskDescs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeveloperDetail method, of class Task.
     */
    @Test
    public void testSetDeveloperDetail() {
        System.out.println("setDeveloperDetail");
        String[] developerDetail = null;
        Task instance = new Task();
        instance.setDeveloperDetail(developerDetail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Task.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        String[] duration = null;
        Task instance = new Task();
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Task.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 0;
        Task instance = new Task();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCount method, of class Task.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        int count = 0;
        Task instance = new Task();
        instance.setCount(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOption method, of class Task.
     */
    @Test
    public void testSetOption() {
        System.out.println("setOption");
        String[] option = null;
        Task instance = new Task();
        instance.setOption(option);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChoice method, of class Task.
     */
    @Test
    public void testSetChoice() {
        System.out.println("setChoice");
        String choice = "";
        Task instance = new Task();
        instance.setChoice(choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Task.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int[] status = null;
        Task instance = new Task();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescs = "";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(taskDescs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        Task instance = new Task();
        String expResult = "";
        String result = instance.createTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyChoice method, of class Task.
     */
    @Test
    public void testVerifyChoice() {
        System.out.println("verifyChoice");
        Task instance = new Task();
        String expResult = "";
        String result = instance.verifyChoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyTaskName method, of class Task.
     */
    @Test
    public void testVerifyTaskName() {
        System.out.println("verifyTaskName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.verifyTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyDeveloperName method, of class Task.
     */
    @Test
    public void testVerifyDeveloperName() {
        System.out.println("verifyDeveloperName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.verifyDeveloperName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyTaskDuration method, of class Task.
     */
    @Test
    public void testVerifyTaskDuration() {
        System.out.println("verifyTaskDuration");
        Task instance = new Task();
        String expResult = "";
        String result = instance.verifyTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
