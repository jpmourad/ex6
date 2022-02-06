package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read_Value {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statemnt = null;
        ResultSet rs = null;
        PostgreSQLConnect obj_PostgreSQLConnect = new PostgreSQLConnect();

        connection = obj_PostgreSQLConnect.get_connection();

        try {

            String query = "select * from bovino";
            statemnt = connection.createStatement();
            rs = statemnt.executeQuery(query);

            while(rs.next()){
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.println(rs.getString(3));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
