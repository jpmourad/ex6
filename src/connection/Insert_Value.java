package connection;

import java.sql.Connection;
import java.sql.Statement;
public class Insert_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statemnt = null;

        PostgreSQLConnect obj_PostgreSQLConnect = new PostgreSQLConnect();

        connection = obj_PostgreSQLConnect.get_connection();

        try {
            String query = "insert into bovino(brinco, nome, situacao, sexo, brinco_Mae, brinco_Pai, atributos.Raca, data_Nascimento) values('108','Soberano', 'Seca','J', '', '', 'Gir', '01/01/2017')";
            statemnt = connection.createStatement();
            statemnt.executeUpdate(query);
            System.out.println("Os valores foram inseridos com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
