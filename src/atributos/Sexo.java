package atributos;

public enum Sexo {
    SEXO_M("M"),
    SEXO_F("F");


    private final String sex;

    Sexo(final String sex){
        this.sex = sex;
    }
    public String getSexo() {
        return sex;
    }
}

