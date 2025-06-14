
package travell.management.systumm;
import java.sql.*; 
public class Conn {
  Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/travellmanagementsystummm","root","thakur55@"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            e.printStackTrace();
        }  
    }  
}  

    

