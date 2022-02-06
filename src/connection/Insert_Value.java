package connection;

import atributos.Bovino;

import java.sql.Connection;
import java.sql.Statement;
public class Insert_Value {
    Bovino bovino;

    public Insert_Value(Bovino bovino) {
        this.bovino = bovino;
    }

    public void insert() {
        Connection connection = null;
        Statement statemnt = null;

        PostgreSQLConnect obj_PostgreSQLConnect = new PostgreSQLConnect();

        connection = obj_PostgreSQLConnect.get_connection();

        try {
            String query = "insert into bovino(brinco, nome, situacao, sexo, brinco_Mae, brinco_Pai, Raca, data_Nascimento) values(\'" +
                    this.bovino.getBrinco() + "\',\'" + this.bovino.getNome() + "\',\'" + this.bovino.getSituacao() + "\',\'" + this.bovino.getSexo() + "\',\'" + this.bovino.getBrinco_Mae() + "\',\'"
                    + this.bovino.getBrinco_Pai() + "\',\'" + this.bovino.getRaca().toString() + "\',\'" + this.bovino.getData_Nascimento() + "\');";
            System.out.println(
                    query
            );
            statemnt = connection.createStatement();
            statemnt.executeUpdate(query);
            System.out.println("Os valores foram inseridos com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

