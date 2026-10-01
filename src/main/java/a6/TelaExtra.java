package a6;

public class TelaExtra extends PlanoDecorator {

    public TelaExtra(Plano plano) {
        super(plano);
    }

    public float getPercentualMensalidade() {
        return 10.0f;
    }

    public String getNomeRecurso() {
        return "Tela Extra";
    }
}
