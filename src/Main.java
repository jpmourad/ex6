import atributos.Bovino;
import atributos.Raca;
import connection.Insert_Value;
import connection.Read_Value;


public class Main {
    public static void main(String[] args) {
        Bovino bovino = new Bovino("002", "Angelino", "Morto", "F", "", "001", Raca.RACA_GIR,"01/02/2018", "", "", "");



        Insert_Value inserir = new Insert_Value(bovino);
        inserir.insert();

        Read_Value ler = new Read_Value();
        ler.read(bovino.getBrinco(),null); // mostrar os dados a partir do brinco
        //ler.read(null, bovino.getNome()); // mostrar os dados a partir do nome
    }


}





