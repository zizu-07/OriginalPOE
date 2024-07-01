
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Mongezi Thomo (ST10456400)
 */
public class OriginalPOE {

    
    public static void main(String[] args) {
    
        Task objTask = new Task();
        //Part 1
        //Declaring variables
        String name;
        String lastName;
        String usernameReg;
        String passwordReg;
        String usernameLog;
        String passwordLog;
        
        //IUser must enter their name
        name = JOptionPane.showInputDialog("Enter your First Name");
        objTask.setName(name);
        
        //IUser must enter their last name
       lastName = JOptionPane.showInputDialog("Enter your Last Name");
        objTask.setSurname(lastName);
        
       //IUser must enter their username to register
        usernameReg = JOptionPane.showInputDialog("Enter your Username");
        objTask.setRegisteredUsername(usernameReg);
        
        objTask.registerUser();
        
        //IUser must enter their password to register
        passwordReg = JOptionPane.showInputDialog("Enter your Password");
        objTask.setRegisteredPassword(passwordReg);
        
        objTask.registerUser();
        //Message showing that the user must enter the details they used to register for them to login
        JOptionPane.showMessageDialog(null,"Please login with your details");
        
        //User must enter their previous username
        usernameLog = JOptionPane.showInputDialog("Please enter your registered Username");
        objTask.setLoginUsername(usernameLog);
        
       //User must enter their previous password
        passwordLog = JOptionPane.showInputDialog("Please enter your registered Password");
        objTask.setLoginPassword(passwordLog);
        
        objTask.returnLoginStatus();
        
        //Part 2 & 3
        
        String choices;
        String taskName[] = null;
        String taskDescription[] = null;
        String developerName[] = null;
        String taskDuration[] = null;
        String taskID[] = null;
        int status[] = null;
        int size = 0;
        int count;
        int total = 0;
        String[] delete = {"Delete", "Cancel"};
        String[] options = {"To Do", "Done", "Doing"};
        
        //Choose from the following options
        
       
           
        choices = JOptionPane.showInputDialog("Welcome to EasyKanban"
                                              +"\n)  Please enter the following: "
                                              +"\n1) Add Task"
                                              +"\n2) Show Report"
                                              +"\n3) All tasks with (Done) "
                                              +"\n4) Task with Longest Duration"
                                              +"\n5) Search for Task"
                                              +"\n6) Search task by developer"
                                              +"\n7) Delete a task"
                                              +"\n8) QUIT!");
        
        
        objTask.setChoice(choices);
        choices = objTask.verifyChoice();
        
        while(choices.equals("1") || choices.equals("2") || choices.equals("3") || choices.equals("4") || choices.equals("5") || choices.equals("6") || choices.equals("7")) {
                
            //Adding tasks
            if(choices.equals("1")) {
                
                // The number of tasks
                size = Integer.parseInt(JOptionPane.showInputDialog("Enter how many tasks you want to enter"));
                objTask.setSize(size);
                
                //Declaring the size of the arrays
                taskName = new String[size];
                developerName = new String[size];
                taskDuration = new String[size];
                taskDescription = new String[size];
                taskID = new String[size];
                status = new int[size];
                
                for (count = 0; count < size; count++) {
                    objTask.setCount(count);
                    
                    //User must enter the name of the task
                    taskName[count] = JOptionPane.showInputDialog("Enter the name for task" );
                    objTask.setTaskName(taskName);
                    taskName[count] = objTask.verifyTaskName();
                    
                    //User must enter the task description
                    taskDescription[count] = JOptionPane.showInputDialog("Enter the task description that has less than 50 characters");
                    objTask.setTaskDescs(taskDescription);
                    while (!objTask.checkTaskDescription(taskDescription[count])) {
                        taskDescription[count] = JOptionPane.showInputDialog("Please enter the task description that is 50 characters or less");
                        objTask.setTaskDescs(taskDescription);
                    }
                    
                    if (objTask.checkTaskDescription(taskDescription[count])) {
                        JOptionPane.showMessageDialog(null, "Task successfully captured");
                    }
                    
                    //User must enter the developers name
                    developerName[count] = JOptionPane.showInputDialog("Pease enter your First and Last name of the developer assigned to the task");
                    objTask.setDeveloperDetail(developerName);
                    developerName[count] = objTask.verifyDeveloperName();
                    
                    //user must enter the task duration
                    taskDuration[count] = JOptionPane.showInputDialog("Pease enter the hours for the task");
                    objTask.setDuration(taskDuration);
                    taskDuration[count] = objTask.verifyTaskDuration();
                    
                    total = total + Integer.parseInt(taskDuration[count]);
                    objTask.setTotal(total);
                    
                    //Choosing the status of the task
                    status[count] = JOptionPane.showOptionDialog(null, "The status of this task", "Task Status", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, objTask.getOption(), null);
                    objTask.setStatus(status);
                    
                    //Displaying the task details
                    JOptionPane.showMessageDialog(null, objTask.printTaskDetails());
                    
                    //Creates the task ID
                    taskID[count] = objTask.createTaskID();
                 
                    
                }
                
            }
            
            //Displaying the report for tasks
        if (choices.equals("2"))  {
            
            StringBuilder displayReport = new StringBuilder();
            for(int i = 0; i<  size; i++ ) {
                if(taskName[i] != null) {
                    displayReport.append("Task Name: ").append(taskName[i])
                                 .append("\nDeveloper Details: ").append(developerName[i])
                                 .append("\nTask Duration: ").append(taskDuration[i] + " Hours")
                                 .append("\nTaskIDs: ").append(taskID[i])
                                 .append("\nStatus: ").append(options[status[i]] + "\n\n");
                }
            }
            
            if (size == 0) {
                JOptionPane.showMessageDialog(null, "Please add a task to view a report");
            }
            else {
                JOptionPane.showMessageDialog(null, displayReport.toString());
            }
        }
        
        //All tasks with the status (Done)
        if (choices.equals("3")) {
            
            StringBuilder doneTask = new StringBuilder();
            int found = 0;
            if (status != null && developerName != null && taskName != null && taskDuration !=null) {
                
                for (int i = 0; i < size; i++) {
                    
                    if(status[i] == 1) {
                        
                        doneTask.append("Task Name: ").append(taskName[i])
                                .append("\nDeveloper Details: ").append(developerName[i])
                                .append("\nTask Duation: ").append(taskDuration[i]).append("Hours\n\n");
                        found++;
                    }
                }
            }
            if (found > 0) {
                JOptionPane.showMessageDialog(null, doneTask.toString());
            }
            else {
                JOptionPane.showMessageDialog(null, "No tasks have been completed");
            }
        }
        
        //Tasks with the longest task duration
        if (choices.equals("4")) {
            if(size == 0) {
                JOptionPane.showMessageDialog(null, "Please add a task to be able to proceed");
        }
            else {
                int largest = 0;
                String longestDurationDeveloper = null;
            
                for (int i = 0; i < size; i++) {
                    if (Integer.parseInt(taskDuration[i]) > largest) {
                    largest = Integer.parseInt(taskDuration[i]);
                    longestDurationDeveloper = developerName[i];
           }
          }
               JOptionPane.showMessageDialog(null, "Developer: " + longestDurationDeveloper + "\nDuration: " + largest + " Hours");
        }
       }
        
        //Searches for the tasks created
        if(choices.equals("5")) {
            String search = "";
            boolean found = false;
            
            search = JOptionPane.showInputDialog("Enter the name of the task you are looking for");
            
            for(int i = 0; i < size; i++) {
                if (search.equalsIgnoreCase(taskName[i])) {
                    
                    JOptionPane.showMessageDialog(null, "Task Name: " + taskName[i] + "\nDeveloper Details: " + developerName[i] + "\nStatus" + options[status[i]]);
                found = true;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "The entered task does not exist");
            }
        }
        
        //Searches for the developer's name
        if(choices.equals("6")) {
            
            String search = "";
            boolean found = false;
            StringBuilder searchFound = new StringBuilder();
            
            search = JOptionPane.showInputDialog("Enter the developer name you are looking for");
            for (int i=0; i<size; i++) {
                
                if(search.equalsIgnoreCase(developerName[i])) {
                    searchFound.append("Name: ").append(taskName[i])
                            .append("\nStatus: ").append(options[status[i]]).append("\n\n");
                   found = true;
                }
            }
            if(found) {
                JOptionPane.showMessageDialog(null, searchFound.toString());
            }
            else {
                JOptionPane.showMessageDialog(null, "The Name you searched for is not available");
            }
        }
        
        //Option to delete the tasks created by the user
        if (choices.equals("7")) {
                
                String deleted = "";
                boolean deletedTask = false;
                int confirm;
                
                deleted = JOptionPane.showInputDialog("Enter the task name you want to delete");
                for (int i = 0; i < size; i++) {
                    if (deleted.equalsIgnoreCase(taskName[i])) {
                        
                        confirm = JOptionPane.showOptionDialog(null, "Are you sure you want to delete? ", "Confirm", JOptionPane.PLAIN_MESSAGE, JOptionPane.WARNING_MESSAGE, null, delete, null);
                    
                    total = total -Integer.parseInt(taskDuration[i]);
                    objTask.setTotal(total);
                    
                    taskName[i] = null;
                    developerName[i] = null;
                    taskDescription[i] = null;
                    taskDuration[i] = null;
                    status[i] = -1;
                    taskID = null;
                    
                    deletedTask = true;
                    }
                }
             if(deletedTask) {
                 JOptionPane.showMessageDialog(null, "Task is successfully deleted");
             }
             else{
                JOptionPane.showMessageDialog(null, "Task was not found");
             }
        }
            
         choices = JOptionPane.showInputDialog("Please enter the following: "
                                              +"\n1) Add Task"
                                              +"\n2) Show Report"
                                              +"\n3) All tasks with (Done) "
                                              +"\n4) Task with Longest Duration"
                                              +"\n5) Search for Task"
                                              +"\n6) Search task by developer"
                                              +"\n7) Delete a task"
                                              +"\n8) QUIT!");
         objTask.setChoice(choices);
         choices = objTask.verifyChoice();
        }
        
        //Quitting
        if (choices.equals("8")) {
            JOptionPane.showMessageDialog(null, "Your tasks will take the total of: " + objTask.returnTotalHours() + " Hours");
            JOptionPane.showMessageDialog(null, "Quitting!");
        }
    }
    
    }
    
