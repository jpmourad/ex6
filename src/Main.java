import atributos.Bovino;
import atributos.Raca;


public class Main {
    public static void main(String[] args) {
        Bovino bovino = new Bovino("brinco", "Angelino", "Morto", "", "", "001",
                Raca.RACA_GIR,"01/02/2018", "", "", "");
        System.out.println(bovino);
    }


}
