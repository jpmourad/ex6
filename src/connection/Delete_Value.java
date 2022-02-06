package connection;

import java.sql.Connection;
import java.sql.Statement;

public class Delete_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statemnt = null;

        PostgreSQLConnect obj_PostgreSQLConnect = new PostgreSQLConnect();

        connection = obj_PostgreSQLConnect.get_connection();

        try {
            String query = "delete from bovino where sl_no='2'";
            statemnt = connection.createStatement();

            statemnt.executeUpdate(query);
            System.out.println("Deletado");

        } catch(Exception e){
            e.printStackTrace();

        }
    }
}
