package atributos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bovino {
    private String brinco;
    private String nome;
    private String situacao;
    private String sexo;
    private String brinco_Mae;
    private String brinco_Pai;
    private Raca raca;
    private String data_Nascimento;
    private String data_Prenhes;
    private String data_ProximoParto;
    private String data_UltimoParto;

    public Bovino(String brinco, String nome, String situacao, String sexo,
                  String brinco_Mae, String brinco_Pai, Raca raca, String data_Nascimento,
                  String data_Prenhes, String data_ProximoParto, String data_UltimoParto) {
        setBrinco(brinco);
        setNome(nome);
        setSituacao(situacao);
        setSexo(sexo);
        setBrinco_Mae(brinco_Mae);
        setBrinco_Pai(brinco_Pai);
        setRaca(raca);
        setData_Nascimento(data_Nascimento);
        setData_Prenhes(data_Prenhes);
        setData_ProximoParto(data_ProximoParto);
        setData_UltimoParto(data_UltimoParto);
    }

    public String getBrinco() {
        return brinco;
    }

    public void setBrinco(String brinco) {
        if (brinco.length()==0 || brinco.length()>8){
            throw new IllegalArgumentException("Tamanho do campo brinco é invalido");
        }
        this.brinco = brinco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length()==0 || nome.length()>20){
            throw new IllegalArgumentException("Tamanho do campo nome é invalido");
        }
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        boolean verificador = false;
        for (Situacao s : Situacao.values()) {
            if (s.getSituacao().equals(situacao)) {
                verificador = true;
                break;
            }
        }
        if(verificador == false){
            throw new IllegalArgumentException("Situação Invalida");
        }
        this.situacao = situacao;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        boolean verificador = false;
        for (Sexo s : Sexo.values()) {
            if (s.getSexo().equals(sexo)) {
                verificador = true;
                break;
            }
        }
        if(verificador == false){
            throw new IllegalArgumentException("atributos.Sexo Invalido");
        }
        this.sexo = sexo;
    }

    public String getBrinco_Mae() {
        return brinco_Mae;
    }

    public void setBrinco_Mae(String brinco_Mae) {
        if (brinco_Mae.length()>8){
            throw new IllegalArgumentException("Tamanho do campo Brinco Mãe é invalido");
        }
        this.brinco_Mae = brinco_Mae;
    }

    public String getBrinco_Pai() {
        return brinco_Pai;
    }

    public void setBrinco_Pai(String brinco_Pai) {
        if (brinco_Pai.length()>8){
            throw new IllegalArgumentException("Tamanho do campo Brinco Pai é invalido");
        }
        this.brinco_Pai = brinco_Pai;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(String data_Nascimento) {
       try
       {
           Date Data_Nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data_Nascimento);
       }catch (ParseException e)
       {
           throw new IllegalArgumentException("Data de nascimento Invalida");
       }
        this.data_Nascimento = data_Nascimento;
    }

    public String getData_Prenhes() {
        return data_Prenhes;
    }

    public void setData_Prenhes(String data_Prenhes) {
        this.data_Prenhes = data_Prenhes;
    }

    public String getData_ProximoParto() {
        return data_ProximoParto;
    }

    public void setData_ProximoParto(String data_ProximoParto) {
        this.data_ProximoParto = data_ProximoParto;
    }

    public String getData_UltimoParto() {
        return data_UltimoParto;
    }

    public void setData_UltimoParto(String data_UltimoParto) {
        this.data_UltimoParto = data_UltimoParto;
    }

    @Override
    public String toString() {
        return "atributos.Bovino{" +
                "brinco='" + brinco + '\'' +
                ", nome='" + nome + '\'' +
                ", situacao=" + situacao +
                ", sexo=" + sexo +
                ", brinco_Mae='" + brinco_Mae + '\'' +
                ", brinco_Pai='" + brinco_Pai + '\'' +
                ", raca=" + raca +
                ", data_Nascimento=" + data_Nascimento +
                ", data_Prenhes=" + data_Prenhes +
                ", data_ProximoParto=" + data_ProximoParto +
                ", data_UltimoParto=" + data_UltimoParto +
                '}';
    }
}


