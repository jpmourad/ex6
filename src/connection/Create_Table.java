package connection;

import java.sql.Connection;
import java.sql.Statement;


public class Create_Table {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statemnt=null;

        PostgreSQLConnect obj_PostgreSQLConnect=new PostgreSQLConnect();

        connection=obj_PostgreSQLConnect.get_connection();

        try {

            String query="create table bovino(sl_no SERIAL primary key, brinco varchar(8) NOT NULL, nome varchar(20) NOT NULL, situacao varchar(15), sexo varchar(2), brinco_mae varchar(8), brinco_pai varchar(8), raca varchar(15), data_Nascimento DATE )";
            statemnt= connection.createStatement();
            statemnt.executeUpdate(query);
            System.out.println("Finalizado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
