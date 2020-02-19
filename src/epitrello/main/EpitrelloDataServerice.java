/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epitrello.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vatsalya
 */
public class EpitrelloDataServerice {

    /**
     * @param args the command line arguments
     */
    
    Statement stmt = null;
    PreparedStatement preparedStmt = null;
    Connection conn = null;
    
    public String addUser(String user){
        
        String query = " insert into MST_USER (USER) values (?)";
        String st = "";
        boolean status = false;
        
        //preparedstatement to Insert
        try{
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, user);
            
            // execute the preparedstatement
            status = preparedStmt.execute();
            
             return "Success";
        }
        catch(SQLException sqlex){
            //Handles SQL Exception
            sqlex.printStackTrace();
            
            return "Failure";
        }
       
       
    }
    
    public String addList(String list){
    
        return "Success";
    }
    
    public String addTask(String list, String task, int estimatedTime, int priority, String description){
    
        return "Success";
    }
    
    public String editTask(String task, int estimatedTime, int priority, String description){
    
        return "Sucess";
    }
    
    public String assignTask(String task, String users){
    
        return "Success";
    }
    
    public String printTask(String task){
    
        return "";
    }
    
    public String completeTask(String task){
    
        return "";
    }
    
    public String printList(String list){
    
        return "";
    }
    
    public String printUserTasks(String user){
    
        return "";
    }
    
    public String moveTask(String task, String list){
    
        return "";
    }
    
    public String deleteTask(String task){
    
        return "";
    }
    
}
