
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class DB {
static Connection c;
ResultSet rset;
static String emp_name ;
static public Statement stmt;
    String query ; 
     public static void initializeconnection (){
    
        try{
            
    Class.forName("com.mysql.jdbc.Driver"); 
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foxproject?useUnicode=true&characterEncoding=utf-8" , "root" , null);
      System.out.println("Connection with FoxProject DB Succesed");
              stmt = c.createStatement();
           

        }
        catch(ClassNotFoundException | SQLException ex){
        ex.getMessage();
                }
        }

    public boolean check_password (String name , String pass){
    query = "Select password from employee WHERE name = '" + name + "'" ;       
    try {
        rset = stmt.executeQuery(query) ;
        if(rset.next())
        if(pass.equalsIgnoreCase(rset.getString(1)))
        {   
            emp_name = name ; 
            return true ;
        } 
            
            return false ; 
            
            
    } catch (SQLException ex) {
        System.out.println("Connection with dataBase failed");
    }
         
    return false ; 
    
    }
    
    public boolean ValueIsExist(JTable table , int column , String value) 
    { 
      for (int i = 0; i < table.getRowCount(); i++)
      {
                if (table.getValueAt(i, column).equals(value))
                {
                    return true ;
                }
                
      } 
      
      return false ;
 }
    
    public int returnRowIndexForValue(JTable table , int column , String value) 
    { 
      for (int i = 0; i < table.getRowCount(); i++)
      {
                if (table.getValueAt(i, column).equals(value))
                {
                    return i ;
                }
                
      } 
      
      return -1 ;
 }
    
    
}
