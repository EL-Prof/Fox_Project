
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
static Connection c;
ResultSet rset;
static String emp_name ;
static public Statement stmt;
    String query ; 
    String name,type,wholeprice,quantity,seelingprice ;
     public static void initializeconnection (){
    
        try{
            
    Class.forName("com.mysql.jdbc.Driver"); 
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foxproject" , "root" , null);
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
    public void bill(String parcode){
        String query2 ;
        query2="select * from product where parcode ="+parcode ;
        ResultSet x = null ;
        try {x=stmt.executeQuery(query2);
            
        } catch (Exception e) {System.out.println("wrong");
        }
        try{
            while (x.next()) {    
                name=x.getString("name");
                type=x.getString("type");
                wholeprice=x.getString("Wholesale_price");
                seelingprice=x.getString("selling_price");
                
                
            }
        }
        catch(Exception w){
            System.out.println("wrong");
        }
        
    }
    
}
