package atributos;

public enum Raca {
    RACA_GIROLANDO("Girolando"),
    RACA_HOLANDES("Holandês"),
    RACA_GIR("Gir"),
    RACA_JERSEY("Jersey");

    private final String raca ;

    Raca(final String raca){
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }

    @Override
    public String
    toString() {
        return raca;
    }
}