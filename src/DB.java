
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class DB {
    static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
   static  Date d = new Date() ;
static Connection c;
ResultSet rset;
static String emp_name ;
static public Statement stmt;
    String query ; 
    String name,type,wholeprice,quantity,seelingprice ;
     public static void initializeconnection (){
    
        try{
            
    Class.forName("com.mysql.jdbc.Driver"); 
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/foxproject?useUnicode=true&characterEncoding=utf-8" , "root" , null);
      System.out.println("Connection with FoxProject DB Succesed");
              stmt = c.createStatement();
           

        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Connection with DataBase Failed!", "Error", 2, new ImageIcon("Error.png"));
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
            
            
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Connection with DataBase Failed!", "Error", 2, new ImageIcon("Error.png"));
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
    
    
    
      public boolean check_password2 ( String pass){
    query = "Select password from employee WHERE name = 'ahmed'";       
    try {
        rset = stmt.executeQuery(query) ;
        if(rset.next())
        if(pass.equalsIgnoreCase(rset.getString(1)))
        {   
            emp_name = name ; 
            return true ;
        } 
            
            return false ; 
            
            
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Connection with DataBase Failed!", "Error", 2, new ImageIcon("Error.png"));
    }
         
    return false ; 
    
    }
}
