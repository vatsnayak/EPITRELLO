/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epitrello.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vatsalya
 */
public class DatabaseConnection {
    
   static final String JDBC_DRIVER = "org.h2.Driver";   
   static final String DB_URL = "jdbc:h2:~/test";  
   
   //  Database credentials 
   static final String USER = "sa"; 
   static final String PASS = ""; 
   
   Connection conn = null; 
   
   public void buildDatabase(){
   
      try { 
         // STEP 1: Register JDBC driver 
         Class.forName(JDBC_DRIVER); 
             
         //STEP 2: Open a connection 
         System.out.println("Connecting to database..."); 
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
         
         boolean status = conn == null ? false : true;
         System.out.println("Database connected: "+status);
         
         
      // STEP 4: Clean-up environment         
      } catch(SQLException se ) { 
      
         //Handle errors for JDBC 
         se.printStackTrace(); 
      
      }catch(Exception ex){
          
          //Handles errors for Class Not Found 
          ex.printStackTrace(); 
      }
      
   }
   
   public void closeDatabase(){
   
       try{
        conn.close();
       }catch(SQLException ex){
           //Handles SQL Exception
           ex.printStackTrace();
       }
   }
    
}
