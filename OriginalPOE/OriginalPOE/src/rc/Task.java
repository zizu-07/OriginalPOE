
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Mongezi Thomo (ST10456400)
 */
public class Task {
    //Part 1
    private String name;
    private String surname;
    private String registeredUsername;
    private String registeredPassword;
    private String loginUsername;
    private String loginPassword;
    boolean valid;
    boolean validTwo;
    boolean validThree;
    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-[{}]:;',?/*~$^+=<>]).{8,}$";
    private final Pattern pattern = Pattern.compile(regex);

    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRegisteredUsername() {
        return registeredUsername;
    }

    public String getRegisteredPassword() {
        return registeredPassword;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public boolean isValid() {
        return valid;
    }

    public boolean isValidTwo() {
        return validTwo;
    }

    public boolean isValidThree() {
        return validThree;
    }

    public String getRegex() {
        return regex;
    }

    public Pattern getPattern() {
        return pattern;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRegisteredUsername(String registeredUsername) {
        this.registeredUsername = registeredUsername;
    }

    public void setRegisteredPassword(String registeredPassword) {
        this.registeredPassword = registeredPassword;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setValidTwo(boolean validTwo) {
        this.validTwo = validTwo;
    }

    public void setValidThree(boolean validThree) {
        this.validThree = validThree;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
    
    //Method checking if the username has an underscore and has no more than 5 characters
    public boolean checkUserName(String registeredUsername)  {
        valid = (registeredUsername.contains("_") && (registeredUsername.length() <= 5));
        
        return valid;
    }
    
   //Method checking the password
    public boolean checkPasswordComplexity(String registeredPassword) {
        Matcher matching =pattern.matcher(registeredPassword);
        
        validTwo = matching.matches();
        
        return validTwo;
    }
    
    //Registering the password and username
    public void registerUser() {
        labelOne: {
            while(registeredPassword != null) {
                break labelOne;
            }
            if(registeredUsername != null) {
                while(!checkUserName(registeredUsername)) {
                    JOptionPane.showMessageDialog(null,"Username is incorrectly formated, "
                                                  + " please make sure that the username has an underscore(_) and has not ore than 5 charaters");
                registeredUsername = JOptionPane.showInputDialog("Please enter the username that meets the requirements");
                }
                
                if(checkUserName(registeredUsername)) {
                    JOptionPane.showMessageDialog(null, "Username is successfully captured");
                }
            }
        }
        if(registeredPassword == null) {
            return;
        }
        
        Matcher matcher = pattern.matcher(registeredPassword);
        
        while(!checkPasswordComplexity(registeredPassword)) {
                    JOptionPane.showMessageDialog(null,"Password is incorrectly formated, "
                                                  + " please make sure that the passwod has a special character,has more than 8 charaters, and has a number");
                registeredPassword = JOptionPane.showInputDialog("Please enter the password that meets the requirements");
                matcher = pattern.matcher(registeredPassword);
                }
                
                if(checkPasswordComplexity(registeredPassword)) {
                    JOptionPane.showMessageDialog(null, "Password is successfully captured");
                    JOptionPane.showMessageDialog(null, "You have successfully registered your account");
                }
    }
    
    //Login User method
    public boolean loginUser() {
        
        validThree = loginPassword.equals(registeredPassword) && loginUsername.equals(registeredUsername);
        
        return validThree;
    }
    
   
    public void returnLoginStatus() {
        while(!loginUser()) {
            JOptionPane.showMessageDialog(null,"Username or password is incorrect, please try again. ");
            loginUsername = JOptionPane.showInputDialog("Please re-enter your username");
            loginPassword = JOptionPane.showInputDialog("Please re-enter your password");
        }
        if (loginUser()) {
            JOptionPane.showMessageDialog(null, "Welcome back " + name + " " + surname);
        }
    }
    
    //Part 2
    
    private int size;
    private String[] taskName = new String [size];
    private String[] taskDescs = new String [size];
    private String[] developerDetail = new String [size];
    private String[] duration = new String [size];
    private int[] status = new int[size];
    private int total;
    private int count;
    private String[] option = {"To DO", "Done", "Doing" };
    private String choice;
    
    //Getters

    public int getSize() {
        return size;
    }

    public String[] getTaskName() {
        return taskName;
    }

    public String[] getTaskDescs() {
        return taskDescs;
    }

    public String[] getDeveloperDetail() {
        return developerDetail;
    }

    public String[] getDuration() {
        return duration;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public String[] getOption() {
        return option;
    }

    public String getChoice() {
        return choice;
    }

    public int[] getStatus() {
        return status;
    }
    

    //Setters
    public void setSize(int size) {
        this.size = size;
    }

    public void setTaskName(String[] taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescs(String[] taskDescs) {
        this.taskDescs = taskDescs;
    }

    public void setDeveloperDetail(String[] developerDetail) {
        this.developerDetail = developerDetail;
    }

    public void setDuration(String[] duration) {
        this.duration = duration;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void setStatus(int[] status) {
        this.status = status;
    }
    
   //Method for Task Description
    public boolean checkTaskDescription(String taskDescs) {
        boolean valid = taskDescs.length() < 51 && taskDescs.length() > 0 ;
        return valid;
    }
    
    //Method that creates Task ID
    public String createTaskID() {
        
        String one = Character.toString(taskName[getCount()].charAt(0));
        String two = Character.toString(taskName[getCount()].charAt(1));
        String three =  Character.toString(developerDetail[getCount()].charAt(developerDetail[getCount()].length()-3));
        String four =  Character.toString(developerDetail[getCount()].charAt(developerDetail[getCount()].length()-2));
        String five =  Character.toString(developerDetail[getCount()].charAt(developerDetail[getCount()].length()-1));
        
        String taskID = one.toUpperCase() + two.toUpperCase() + ":" + count + ":" + three.toUpperCase() + four.toUpperCase() + five.toUpperCase();
        return taskID;
    }
    
    //Displaying the task details
    public String printTaskDetails() {
        
        String taskTet = "Status: " + option[status[getCount()]]
                        +"\nDeveloper: " + developerDetail[getCount()]
                        +"\nTask Number: " + getCount()+1
                        +"\nTask Name: " + taskName[getCount()]
                        +"\nTask Description: " + taskDescs[getCount()]
                        +"\nTask ID: " + createTaskID()
                        +"\nThe Duration: " + duration[getCount()] + "Hours";
        
        return taskTet;
    }
    
    //The total hours of the task
    public int returnTotalHours() {
        return total;
    }
    
    //Choosing Options
    public String verifyChoice() {
        while(choice== null || !(choice.equals("1")) && !(choice.equals("2")) && !(choice.equals("3")) && !(choice.equals("4")) && !(choice.equals("5")) && !(choice.equals("6")) && !(choice.equals("7")) && !(choice.equals("8"))) {
         
        choice = JOptionPane.showInputDialog("Please enter the following: "
                                              +"\n1) Add Task"
                                              +"\n2) Show Report"
                                              +"\n3) All tasks with (Done) "
                                              +"\n4) Task with Longest Duration"
                                              +"\n5) Search for Task"
                                              +"\n6) Search task by developer"
                                              +"\n7) Delete a task"
                                              +"\n8) QUIT!");
    }
        return choice;
    }
    
    //verifying the task name
    public String verifyTaskName() {
        while(taskName[getCount()].equals("") || taskName[getCount()].length() < 2) {
            taskName[getCount()] = JOptionPane.showInputDialog("Please make sure that you write the task name");
        }
        return taskName[getCount()];
    }
    
    //Verifying the developer name
    public String verifyDeveloperName() {
        
        while(developerDetail[getCount()].equals("") || developerDetail[getCount()].length() < 3) {
            developerDetail[getCount()] = JOptionPane.showInputDialog("Please make sure that you write the Developer name");
        }
        return developerDetail[getCount()];
    }
    
    //Verifying the task duration
    public String verifyTaskDuration() {
        while (true) {
            try {
                Integer.parseInt(duration[getCount()]);
                break;
            }
            
            catch (NumberFormatException e) {
                duration[getCount()] = JOptionPane.showInputDialog("Enter the estimated duration of the task");
            }
        }
        return duration[getCount()];
    }
    
}