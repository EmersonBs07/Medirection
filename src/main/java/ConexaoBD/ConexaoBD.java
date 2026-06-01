package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "medirection";
    private static String usuario = "root";
    private static String senha = "123123";
    
    public static Connection obtemConexao(){
       try{
           Connection c = 
                   DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario,senha);
           return c;
       }
       catch (SQLException e){
           return null;
       } 
    }
}
