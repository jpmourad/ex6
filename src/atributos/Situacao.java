package atributos;

public enum Situacao {
    SIT_LACTACAO("Em Lactação"),
    SIT_SECA("Seca"),
    SIT_VENDIDO("Vendido"),
    SIT_MORTO("Morto");

    private final String situacao;

    Situacao(final String situacao){
        this.situacao = situacao;
    }
    public String getSituacao() {
        return situacao;
    }
}
