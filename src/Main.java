import atributos.Bovino;
import atributos.Raca;
import connection.Insert_Value;
import connection.Read_Value;


public class Main {
    public static void main(String[] args) {
        Bovino bovino = new Bovino("brinco", "Angelino", "Morto", "F", "", "001",
                Raca.RACA_GIR,"01/02/2018", "", "", "");
        System.out.println(bovino);

       Insert_Value inserir = new Insert_Value(bovino);
       inserir.insert();

        Read_Value ler = new Read_Value();
        ler.read(bovino.getBrinco(),null);
        ler.read(null, bovino.getNome());
    }


}





