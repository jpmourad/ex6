package connection;

import java.sql.Connection;
import java.sql.DriverManager;
public class PostgreSQLConnect {


    public static void main(String[] args) {
        PostgreSQLConnect obj_PostgreSQLConnect=new PostgreSQLConnect();

        System.out.println(obj_PostgreSQLConnect.get_connection());

    }


    public Connection get_connection() {

        Connection connection = null;
        String host = "localhost";
        String port = "5432";
        String db_name = "cadastro";
        String username = "postgres";
        String password = "159753";

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            if (connection != null) {
                System.out.println("Connect");
            } else System.out.println("Not connected");

        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;
    }

}
