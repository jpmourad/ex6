package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Read_Value {

    public void read(String brinco, String nome) {

        Connection connection = null;
        Statement statemnt = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        PostgreSQLConnect obj_PostgreSQLConnect = new PostgreSQLConnect();

        connection = obj_PostgreSQLConnect.get_connection();

        try {
            String query = null;
            if(brinco != null) {
                query = "select * from bovino where brinco=\'" + brinco +"\';";
            }
            else if(nome != null){
                query = "select * from bovino where nome=\'" + nome +"\';";
            }
            else {
                query = "select * from bovino";
            }
            statemnt = connection.createStatement();
            rs = statemnt.executeQuery(query);
            rsmd = rs.getMetaData();
            int n_colunas = rsmd.getColumnCount();

            while(rs.next()){
                for (int i = 1; i<=n_colunas; i++){
                    if(i>1){
                        System.out.println(", ");
                    }
                    String valorColuna = rs.getString(i);
                    System.out.print(valorColuna + " " + rsmd.getColumnName(i));
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
